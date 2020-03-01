package ru.job4j.pojo;

/**
 * Модель данных. Книга.
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Book {

    /** Содержит название книги */
    private String name;

    /** Содержит количество страниц в книге */
    private int countOfPages;

    /**
     * Конструктор.
     * @param name - название книги
     * @param countOfPages - количество страниц в книге
     */
    public Book(String name, int countOfPages) {
        this.name = name;
        this.countOfPages = countOfPages;
    }

    /**
     * Получение значения поля name
     */
    public String getName() {
        return name;
    }

    /**
     * Установка значения поля name
     * @param name - название книги
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получение значения поля countOfPages
     */
    public int getCountOfPages() {
        return countOfPages;
    }

    /**
     * Установка значения поля countOfPages
     * @param countOfPages - количество страниц в книге
     */
    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }
}
