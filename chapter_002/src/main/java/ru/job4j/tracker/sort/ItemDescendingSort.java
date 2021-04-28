package ru.job4j.tracker.sort;

import ru.job4j.tracker.sort.Item;

import java.util.Comparator;

/**
 * Comparator обратной сортировки данных
 * для модели данных Item.
 * @author Evgen Kapaev
 */

public class ItemDescendingSort implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o2.getName().compareTo(o1.getName());
    }
}