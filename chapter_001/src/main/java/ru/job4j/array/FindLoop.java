package ru.job4j.array;

/**
 * Class FindLoop осуществляет поиск индекса
 * элемента el массива data, возвращая значение
 * индекса в переменной rst.
 *
 * @author Evgeniy Kapaev
 * @since 26.09.19
 * @version 1.0
 */
public class FindLoop {

    /**
     * indexOf проходит по каждому индексу
     * массива data, сравнивая число, находящееся
     * на позиции этого индекса с искомым числом el.
     *
     * @param data - массив чисел
     * @param el - искомое число массива
     * @return rst - возвращение индекса искомого числа
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
