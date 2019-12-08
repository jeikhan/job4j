package ru.job4j.array;

/**
 * Class Check проверяет однородность
 * логического массива
 *
 * @author Evgeniy Kapaev
 * @since 27.09.19
 * @version 1.1
 */
public class Check {

    /**
     * Метод mono сравнивает каждый
     * элемент массива с заданным в
     * нулевом индексе на true или false.
     * Возвращает true если массив
     * однородный, либо false если нет
     *
     * @param array - логический массив
     * @return result - возвращает true
     *                  или false
     */
    public boolean mono(boolean[] array) {
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
