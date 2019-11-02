package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;

        for (int x = 2; x <= finish; x++) {
            count++;
            for (int y = 2; y < x; y++) {
                if ((x % y) == 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
