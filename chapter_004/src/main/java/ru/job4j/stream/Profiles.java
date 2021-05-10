package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Задание: Составить список адресов клиентов,
 * в анкете клиента есть адрес проживания.
 * Update: добавлена сортировка и исключение
 * дубликатов адресов.
 * @author Evgenii Kapaev
 * @since 10.05.21
 */
public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles
                .stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
