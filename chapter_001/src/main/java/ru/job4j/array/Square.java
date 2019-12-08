package ru.job4j.array;

/**
 * Class Square
 *
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Square {

    /**
     * Метод calculate заполняет массив числами,
     * возведенными в квадрат
     *
     * @param bound - задает длину массива
     * @return rst - возвращает массив чисел
     */
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < result.length; i++) {
            result[i] = (i + 1) * (i + 1);
        }
        return result;
    }
}
