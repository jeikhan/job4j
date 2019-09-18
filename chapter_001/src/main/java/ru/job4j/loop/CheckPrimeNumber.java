package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime;

        if (num < 2) {
            prime = false;
        } else {
            prime = true;
        }

        for (int i = 2; i <= (num / i); i++) {
            if ((num % i) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
