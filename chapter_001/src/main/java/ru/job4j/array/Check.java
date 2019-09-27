package ru.job4j.array;

/**
 * Class Check проверяет однородность
 * логического массива
 *
 * @author Evgeniy Kapaev
 * @since 27.09.19
 * @version 1.0
 */
public class Check {

    /**
     * Метод mono сравнивает каждый
     * элемент массива с заданным в
     * нулевом индексе на true или false.
     * Возвращает true если массив
     * однородный, либо false если нет
     *
     * @param data - логический массив
     * @return result - возвращает true
     *                  или false
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == data[0]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
