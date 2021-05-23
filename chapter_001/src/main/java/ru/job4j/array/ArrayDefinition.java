package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Вася";
        names[1] = "Паша";
        names[2] = "Саша";
        names[3] = "Валя";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
