package ru.job4j.loop;

/**
 * Класс Fitness подсчитывает количество месяцев,
 * через которое ivan обгонит nikolay в тяге весов
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Fitness {

    /**
     * Метод calculate инкрементирует количество месяцев
     * @param ivan - значение тягового веса Ивана
     * @param nikolay - значение тягового веса Николая
     * @return month - количество месяцев прошедщих до
     * того как Иван обогнал Николая
     */
    public int calculate(int ivan, int nikolay) {
        int month = 0;
        while (ivan < nikolay) {
            ivan *= 3;
            nikolay *= 2;
            month++;
        }
        return month;
    }
}
