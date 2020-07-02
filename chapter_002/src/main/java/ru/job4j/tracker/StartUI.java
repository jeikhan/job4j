package ru.job4j.tracker;

/**
 * Консольное приложение для работы с классом Tracker
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    /**
     * Алгоритмы взаимодействия с пользователем
     * @param input - вводимые данные
     * @param tracker - Tracker
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select menu: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * Вывод меню взаимодействия в консоль
     */
    private void showMenu(UserAction[] actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    /**
     * Main
     * @param args - параметры
     */
    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] action = {
                new CreateAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new ShowAllAction(output),
                new FindIdAction(output),
                new FindNameAction(output),
                new ExitAction()
        };
        new StartUI(output).init(input, tracker, action);
    }
}
