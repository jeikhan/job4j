package ru.job4j.tracker;

/**
 * Консольное приложение для работы с классом Tracker
 * @author Evgeniy Kapaev
 * @version 1.0
 * @since 14.04.2020
 */
public class StartUI {

    /**
     * Алгоритмы взаимодействия с пользователем
     * @param input - вводимые данные
     * @param tracker - Tracker
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            System.out.println("======================");
            int select = input.askInt("Select menu item: ");
            UserAction action = actions[select];
            System.out.println("");
            run = action.execute(input, tracker);
        }
    }

    /**
     * Вывод меню взаимодействия в консоль
     */
    private void showMenu(UserAction[] actions) {
        System.out.println("======== Menu ========");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    /**
     * Создание новой заявки
     * @param input входные данные
     * @param tracker
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create new Item ===");
        String name = input.askStr("Enter name: ");
        System.out.println("---");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Name: " + item.getName());
        System.out.println("Id: " + item.getId());
        System.out.println("=======================\n");
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("=== All items ===");
        Item[] allItems = tracker.findAll();
        for (int index = 0; index < allItems.length; index++) {
            System.out.println(
                    (index + 1) + ". " + allItems[index].getName() + " (" + allItems[index].getId() + ")"
            );
        }
        System.out.println("=================\n");
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Enter id current item: ");
        String name = input.askStr("Enter new item name: ");
        System.out.println("---");
        System.out.println(
                "Old item: " + tracker.findById(id).getName() + " (" + tracker.findById(id).getId() + ")"
        );
        Item result = tracker.replace(name, id);
        System.out.println(
                "Updated item: " + tracker.findById(id).getName() + " (" + tracker.findById(id).getId() + ")"
        );
        System.out.println("=================\n");
    }


    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Enter id: ");
        Item[] newList = tracker.delete(id);
        System.out.println("---");
        for (int index = 0; index < newList.length; index++) {
            System.out.println(
                    (index + 1) + ". " + newList[index].getName() + " (" + newList[index].getId() + ")"
            );
        }
        System.out.println("===================\n");
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        String id = input.askStr("Enter id: ");
        System.out.println("---");
        System.out.println(
                "Found item:\n" + tracker.findById(id).getName() + " (" + tracker.findById(id).getId() + ")"
        );
        System.out.println("=========================\n");
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ===");
        String name = input.askStr("Enter name: ");
        System.out.println("---");
        Item[] result = tracker.findByName(name);
        for (int index = 0; index < result.length; index++) {
            System.out.println(
                    "Found item(s):\n" + (index + 1) + ". " + result[index].getName() + " (" + result[index].getId() + ")"
            );
        }
        System.out.println("=========================\n");
    }

    /**
     * Main
     * @param args - параметры
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] action = {
                new CreateAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new ShowAllAction(),
                new FindIdAction(),
                new FindNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, action);
    }
}
