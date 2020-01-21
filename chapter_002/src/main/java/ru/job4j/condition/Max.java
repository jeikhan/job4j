package ru.job4j.condition;

/**
 * перегрузка методов: нахождение максимального числа
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Max {

    /**
     * с помощью тернарной операции находим максимум
     * из двух чисел
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает максимум из двух числел
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * используя метод, где сравниваются два числа, подставляем
     * в параметры метода для сравнения трех чисел результат
     * сравнеия первого со вторым и третье число
     * @param first - первое число
     * @param second - второе число
     * @param third - третье число
     * @return - возвращает максимум из трех чисел
     */
    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    /**
     * используя попарное сравнение первого со вторым и третьего
     * с четвертым, подставляем методы в качестве параметров для
     * метода сравнения четырех чисел
     * @param first - первое число
     * @param second - второе число
     * @param third - третье число
     * @param fourth - четвертое число
     * @return - возвращает максимум из четырех чисел
     */
    public int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }
}
