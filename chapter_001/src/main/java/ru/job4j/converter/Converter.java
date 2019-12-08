package ru.job4j.converter;

/**
 * Класс Converter производит конвертацию валюты
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Converter {

    /**
     * Метод rubleToEuro конвертирует рубли в евро
     * @param rouble - количество рублей
     * @return - возвращает количество евро
     */
    public static int roubleToEuro(int rouble) {
        return rouble / 70;
    }

    /**
     * Метод roubleToDollar конвертирует рубли в доллары
     * @param rouble - количество рублей
     * @return - возвращает количество долларов
     */
    public static float roubleToDollar(float rouble) {
        return rouble / 60;
    }

    /**
     * Метод euroToRuble конвертирует евро в рубли
     * @param euro - количество евро
     * @return - возвращает количество рублей
     */
    public static int euroToRouble(int euro) {
        return euro * 70;
    }

    /**
     * Метод dollarToRuble конвертирует доллары в рубли
     * @param dollar - количество долларов
     * @return - возвращает количество рублей
     */
    public static int dollarToRouble(int dollar) {
        return dollar * 60;
    }

    public static void main(String[] args) {
        int euro = roubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro ");
        float dollar = roubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar ");
        int roubles = euroToRouble(140);
        System.out.println("140 euro are " + roubles + " roubles ");
        int rouble = dollarToRouble(140);
        System.out.println("140 dollars are " + rouble + " roubles ");
    }
}
