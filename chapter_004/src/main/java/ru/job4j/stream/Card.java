package ru.job4j.stream;

import java.util.stream.Stream;

enum Suit {
    Diamonds,
    Hearts,
    Spades,
    Clubs
}

enum Value {
    V_6,
    V_7,
    V_8
}

public class Card {
    private final Suit suit;
    private final Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(s -> Stream.of(Value.values())
                        .map(v -> new Card(s, v)))
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "["
                + suit
                + ", " + value
                + ']';
    }
}
