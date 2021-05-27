package ru.job4j.array;

import java.util.Arrays;

public class CoffeeMachine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int mod = money - price;
        for (int coin : coins) {
            while (mod - coin >= 0) {
                mod -= coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
