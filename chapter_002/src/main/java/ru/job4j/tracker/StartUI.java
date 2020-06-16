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
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("=====================");
            int select = input.askInt("Select menu item: ");
            System.out.println(" ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findById(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                System.out.println("Program completed...");
                break;
            } else {
                System.out.println("Menu item not found... please try again\n");
            }
        }
    }

    /**
     * Вывод меню взаимодействия в консоль
     */
    private void showMenu() {
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit");
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
        new StartUI().init(input, tracker);
    }
}
