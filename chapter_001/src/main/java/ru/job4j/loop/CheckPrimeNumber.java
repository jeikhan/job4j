package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime;
        if ((num %num == 0) & (num %2 == 0)) {
            prime = false;
        } else {
            prime = true;
        }
        return prime;
    }
}
