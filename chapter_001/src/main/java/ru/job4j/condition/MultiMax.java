package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result, firstSecond;
        firstSecond = first >= second ? first : second;
	    result = firstSecond >= third ? firstSecond : third;
        return result;
    }
}
