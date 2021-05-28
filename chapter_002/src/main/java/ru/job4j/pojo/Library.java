package ru.job4j.pojo;

/**
 * Библиотека.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Library {

    /**
     * Создание массива книг, перестановка местами, вывод
     * книги с определенным названием на консоль.
     * @param args аргументы.
     */
    public static void main(String[] args) {
        Book book = new Book("Five Weeks in a Balloon", 300);
        Book book1 = new Book("From the Earth to the Moon", 350);
        Book book2 = new Book("Around the Moon", 400);
        Book book3 = new Book("Clean code", 450);

        System.out.println("Create array of books");

        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;

        for (Book read : books) {
            System.out.println(read.getName() + " - " + read.getCountOfPages());
        }

        System.out.println("Replace books with index 0 and 3");

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (Book read : books) {
            System.out.println(read.getName() + " - " + read.getCountOfPages());
        }

        System.out.println("Show book with name is Clean code");

        for (Book read : books) {
            if ("Clean code".equals(read.getName())) {
                System.out.println(read.getName() + " - " + read.getCountOfPages());
            }
        }
    }
}
