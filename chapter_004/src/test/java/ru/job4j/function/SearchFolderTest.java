package ru.job4j.function;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SearchFolderTest {
    @Test
    public void whenFilterSize() {
        List<Folder> list = List.of(
                new Folder("fix", 110),
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        List<Folder> expected = List.of(new Folder("fix", 110));
        Predicate<Folder> predicate = f -> f.getSize() > 100;
        List<Folder> result = SearchFolder.filter(list, predicate);
        assertThat(result, is(expected));
    }

    @Test
    public void whenFilterName() {
        List<Folder> list = List.of(
                new Folder("fix", 110),
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        List<Folder> expected = List.of(
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        Predicate<Folder> predicate = f -> f.getName().contains("bug");
        List<Folder> result = SearchFolder.filter(list, predicate);
        assertThat(result, is(expected));
    }
}