package ru.job4j.pojo;

/**
 * модель данных книги
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Book {
    private String name;
    private int countOfPages;

    public Book(String name, int countOfPages) {
        this.name = name;
        this.countOfPages = countOfPages;
    }

    /**
     * аксессоры поля Name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * аксессоры поля countOfPages
     */
    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }
}
