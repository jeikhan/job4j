package ru.job4j.loop;

/**
 * Класс Mortgage считает количество лет, необходимых для
 * погашения кредита
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Mortgage {

    /**
     * @param amount - сумма, выданная по кредиту
     * @param salary - годовой доход
     * @param percent - процентная ставка по кредиту
     * @return year - количество лет выплаты по кредиту
     */
    public int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        while (amount > 0) {
           amount = (amount + (amount * percent)) - salary;
           year++;
        }
        return year;
    }
}
