package ru.job4j.oop;

/**
 * Класс Cat создает двух кошек: Гав и Блэк,
 * которым присваивает клички и то, что они
 * съели
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Cat {

    private String food;
    private String name;

    /**
     * метод show выводит содержимое поля
     * в консоль
     */
    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    /**
     * метод eat принимает параметры из
     * метода main и записывает их в
     * переменную meat (то, что кошки съели)
     * @param meat - переменная
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * метод giveNick принимает параметры из
     * метода main и записывает их в
     * переменную nick (клички кошек)
     * @param nick - переменная
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Cat Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Cat Black");
        black.eat("fish");
        black.show();
    }
}
