package ru.job4j.collect;

import java.util.HashMap;
import java.util.List;

/**
 * Написать программу преобразования List в Map.
 * Задача: преобразовать коллекцию List в Map.
 * @author Evgenii Kapaev
 */
public class OrderConvert {

    /**
     * Конвертация.
     * @param orders модель данных List.
     * @return модель данных Map.
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order el : orders) {
            map.put(el.getNumber(), el);
        }
        return map;
    }
}
