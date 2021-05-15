package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Задание: создать метод для преобразования списка учеников List в Map.
 * @author Evgenii Kapaev
 * @since 15.05.21
 */
public class SchoolListToMap {
    public Map<String, StudentMap> convert(List<StudentMap> students) {
        return students
                .stream()
                .distinct()
                .collect(Collectors.toMap(
                        StudentMap::getSurname,
                        studentMap -> studentMap,
                        (s1, s2) -> s1
                ));
    }
}
