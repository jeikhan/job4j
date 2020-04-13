package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== All items ===");
                System.out.println("All items are: " + tracker.findAll());
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = new Item(name);
                System.out.println("Operation completed " + tracker.replace(item, id));
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.println("Operation completed " + tracker.delete(id));
            } else if (select == 4) {
                System.out.println("=== Find item by id ===");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.println("Item is " + tracker.findById(id));
            } else if (select == 5) {
                System.out.println("=== Find item by name ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Item is " + tracker.findByName(name));
            } else if (select == 6) {
                break;
            }
        }
    }

    private void showMenu() {
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
