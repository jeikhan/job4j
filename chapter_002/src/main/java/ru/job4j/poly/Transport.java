package ru.job4j.poly;

public interface Transport {
    void drive();
    void passengers(int count);
    double costOfFill(int fuel);
}
