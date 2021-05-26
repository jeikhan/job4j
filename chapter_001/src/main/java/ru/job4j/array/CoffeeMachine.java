package ru.job4j.array;

import java.util.Arrays;

public class CoffeeMachine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int mod = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (mod >= coins[i]) {
                mod -= coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
