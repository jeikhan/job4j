package ru.job4j.tracker;

/**
 * Консольное приложение для работы с классом Tracker
 * @author Evgeniy Kapaev
 * @version 1.0
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
