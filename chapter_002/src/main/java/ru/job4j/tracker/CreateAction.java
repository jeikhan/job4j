package ru.job4j.tracker;

/**
 * Создание новой заявки.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class CreateAction implements UserAction {

    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

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
        out.println("=== Create new Item ===");
        String name = input.askStr("Enter name: ");
        out.println("---");
        Item item = new Item(name);
        tracker.add(item);
        out.println("Name: " + item.getName());
        out.println("Id: " + item.getId());
        out.println("=======================\n");
        return true;
    }
}
