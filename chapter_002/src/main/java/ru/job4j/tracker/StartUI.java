package ru.job4j.tracker;

import ru.job4j.tracker.actions.*;
import ru.job4j.tracker.core.Tracker;
import ru.job4j.tracker.io.*;
import ru.job4j.tracker.sort.Item;

import java.time.format.DateTimeFormatter;

/**
 * Консольное приложение для работы с классом Tracker
 *
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    /**
     * Взаимодействие с пользователем
     *
     * @param input   - вводимые данные
     * @param tracker - Tracker
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select menu: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
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
     *
     * @param args - параметры
     */
    public static void main(String[] args) {
        Item timeDate = new Item("timeDate");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println("=== " + timeDate.getCreated().format(formatter) + " ===");
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
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
