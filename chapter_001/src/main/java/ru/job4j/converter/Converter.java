package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {

        return value * 70;
    }

    public static int dollarToRuble(int value) {

        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro ");
        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar ");
        int rubtoeur = euroToRuble(140);
        System.out.println("140 euro are " + rubtoeur + " rubles ");
        int rubtodol = dollarToRuble(140);
        System.out.println("140 dollars are " + rubtodol + " rubles ");
    }
}
