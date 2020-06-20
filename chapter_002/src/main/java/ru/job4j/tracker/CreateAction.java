package ru.job4j.tracker;

/**
 * Создание новой заявки.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class CreateAction implements UserAction {

    /**
     * Вывод пункта меню в консоль.
     * @return название пункта.
     */
    @Override
    public String name() {
        return "Create new item";
    }

    /**
     * Создание новой заявки с выводом в консоль
     * имени и id.
     * @param input объект ввода данных.
     * @param tracker доступ к классу Tracker.
     * @return флаг выхода из программы (true или false).
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Create new Item ===");
        String name = input.askStr("Enter name: ");
        System.out.println("---");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Name: " + item.getName());
        System.out.println("Id: " + item.getId());
        System.out.println("=======================\n");
        return true;
    }
}
