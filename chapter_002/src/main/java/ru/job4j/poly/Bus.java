package ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Расстояние поездки: 100 км.");
    }

    @Override
    public void passengers(int count) {
        int freeSeats = 50 - count;
        System.out.println("Всего мест: 50");
        System.out.println("Количество пассажиров: " + count);
        System.out.println("Оставшихся свободных мест: " + freeSeats);
    }

    @Override
    public double costOfFill(int fuel) {
        return fuel * 50.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bus bus = new Bus();
        bus.drive();
        bus.passengers(30);
        System.out.println("Введите необходимое количество топлива на поездку: ");
        int countFuel = Integer.parseInt(input.nextLine());
        System.out.println("За " + countFuel + " литров вам необходимо заплатить " + bus.costOfFill(countFuel) + " рублей.");
    }
}
