package ru.job4j.collect;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1Array = o1.split("\\.");
        String[] o2Array = o2.split("\\.");
        int o1Lex = Integer.parseInt(o1Array[0]);
        int o2Lex = Integer.parseInt(o2Array[0]);
        return Integer.compare(o1Lex, o2Lex);
    }
}
