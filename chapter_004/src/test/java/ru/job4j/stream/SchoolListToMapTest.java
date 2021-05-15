package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolListToMapTest {
    @Test
    public void whenConvertListToMap() {
        SchoolListToMap convert = new SchoolListToMap();
        StudentMap student1 = new StudentMap(new Student(30, "Ivanov"), "Ivanov");
        StudentMap student2 = new StudentMap(new Student(60, "Petrov"), "Petrov");
        StudentMap student3 = new StudentMap(new Student(90, "Sidorov"), "Sidorov");
        Map<String, StudentMap> actual = convert
                .convert(List.of(student1, student2, student3));
        Map<String, StudentMap> expected = Map.of(
                "Ivanov", student1,
                "Petrov", student2,
                "Sidorov", student3
        );
        assertThat(actual, is(expected));
    }
}