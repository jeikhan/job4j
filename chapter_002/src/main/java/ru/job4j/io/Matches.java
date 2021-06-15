package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (true) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + ", введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            while (matches < 1 || matches > 3) {
                System.out.println("Внимание! Число должно быть от 1 до 3:");
                matches = Integer.parseInt(input.nextLine());
            }
            count -= matches;
            System.out.println("Количество оставшихся спичек: " + count);
            turn = !turn;
            if (count <= 0) {
                break;
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
