package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean condition = false;
        int firtosec = condition ? first : second;
        int result = condition ? third : second;
        return result;
    }
}
