package ru.job4j.array;

/**
 * Class FindLoopMod осуществляет поиск
 * заданного элемента в массиве
 *
 * @author Evgeniy Kapaev
 * @since 26.09.19
 * @version 1.0
 */
public class FindLoopMod {

    /**
     * indexOf ищет по элементам массива, начиная
     * с start и заканчивая finish.
     *
     * @param data - массив чисел
     * @param el - искомое число массива
     * @param start - индекс начала поиска
     * @param finish - индекс конца поиска
     * @return rst - возвращение индекса искомого числа
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for(int i = start; start < finish; start++) {
            if(data[start] == el) {
                rst = start;
                break;
            }
        }
        return rst;
    }
}
