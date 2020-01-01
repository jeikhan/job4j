package ru.job4j.oop;

/**
 * Класс Jukebox в зависимости от входного
 * параметра выводит в консоль то или иное
 * сообщение
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Jukebox {

    /**
     * метод music выводит сообщения в зависимости
     * от входного параметра с помощью условия if-else-if
     * @param position - входной параметр
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюжие");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена :(");
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(3);
    }
}
