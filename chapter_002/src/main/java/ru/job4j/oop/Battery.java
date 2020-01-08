package ru.job4j.oop;

/**
 * класс списывает заряд у одной из батарей, у
 * которой вызывают метод exchange
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Battery {
    private int load;

    /**
     * метод передает значение из size в load
     * @param size - уровень заряда, который списываем у
     *             батареи
     */
    public Battery(int size) {
        this.load = size;
    }

    /**
     * метод вычитает половину заряда у экземпляра класса,
     * переменной которого его объявили
     * @param another - уровень заряда баратеи, которой
     *                приписываем заряд
     */
    public void exchange(Battery another) {
        this.load = this.load - (load / 2);
        another.load = another.load + this.load;
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(10);
        System.out.println("first battery: " + first.load + ". second: " + second.load);
        first.exchange(second);
        System.out.println("first battery: " + first.load + ". second: " + second.load);
    }
}
