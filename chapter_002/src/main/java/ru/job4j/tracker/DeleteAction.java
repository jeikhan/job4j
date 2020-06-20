package ru.job4j.tracker;

/**
 * Удаление существующей заявки.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class DeleteAction implements UserAction {

    /**
     * Вывод пункта меню в консоль.
     * @return название пункта.
     */
    @Override
    public String name() {
        return "Delete item";
    }

    /**
     * Удаление существующей заявки по id.
     * @param input объект ввода данных.
     * @param tracker доступ к классу Tracker.
     * @return флаг выхода из программы (true или false).
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
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
        return true;
    }
}
