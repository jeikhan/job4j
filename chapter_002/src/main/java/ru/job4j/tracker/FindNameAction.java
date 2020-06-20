package ru.job4j.tracker;

/**
 * Поиск заявки по "name".
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class FindNameAction implements UserAction {

    /**
     * Вывод пункта меню в консоль.
     * @return название пункта.
     */
    @Override
    public String name() {
        return "Find item by name";
    }

    /**
     * Поиск заявки по "name".
     * @param input объект ввода данных.
     * @param tracker доступ к классу Tracker.
     * @return флаг выхода из метода (true или false).
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ===");
        String name = input.askStr("Enter name: ");
        System.out.println("---\nFound item(s):");
        Item[] result = tracker.findByName(name);
        for (int index = 0; index < result.length; index++) {
            System.out.println(
                    (index + 1) + ". " + result[index].getName() + " (" + result[index].getId() + ")"
            );
        }
        System.out.println("=========================\n");
        return true;
    }
}
