package ru.job4j.loop;

/**
 * Класс CheckPrimeNumber проверяет является ли
 * число простым
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class CheckPrimeNumber {

    /**
     * Метод check сначала проверяет входит ли число
     * в диапазон простых чисел, т.е. больше 1,
     * если да - проверяет простое оно или составное
     * @param number - входное число
     * @return prime - простое число
     */
    public boolean check(int number) {
        boolean prime;
        if (number < 2) {
            prime = false;
        } else {
            prime = true;
        }
        for (int i = 2; i <= (number / i); i++) {
            if ((number % i) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
