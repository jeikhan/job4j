package ru.job4j.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class JobTest {
    @Test
    public void ascByName() {
        List<Job> jobs = new ArrayList<>();

        jobs.add(new Job("write", 5));
        jobs.add(new Job("read", 3));
        jobs.add(new Job("sleep", 4));

        jobs.sort(new JobAscByName());

        List<Job> expect = List.of(
                new Job("read", 3),
                new Job("sleep", 4),
                new Job("write", 5)
        );

        assertThat(jobs, is(expect));
    }

    @Test
    public void descByName() {
        List<Job> jobs = new ArrayList<>();

        jobs.add(new Job("write", 5));
        jobs.add(new Job("read", 3));
        jobs.add(new Job("sleep", 4));

        jobs.sort(new JobDescByName());

        List<Job> expect = List.of(
                new Job("write", 5),
                new Job("sleep", 4),
                new Job("read", 3)
        );

        assertThat(jobs, is(expect));
    }

    @Test
    public void ascByPriority() {
        List<Job> jobs = new ArrayList<>();

        jobs.add(new Job("write", 5));
        jobs.add(new Job("read", 3));
        jobs.add(new Job("sleep", 4));

        jobs.sort(new JobAscByPriority());

        List<Job> expect = List.of(
                new Job("read", 3),
                new Job("sleep", 4),
                new Job("write", 5)
        );

        assertThat(jobs, is(expect));
    }

    @Test
    public void descByPriority() {
        List<Job> jobs = new ArrayList<>();

        jobs.add(new Job("write", 5));
        jobs.add(new Job("read", 3));
        jobs.add(new Job("sleep", 4));

        jobs.sort(new JobDescByPriority());

        List<Job> expect = List.of(
                new Job("write", 5),
                new Job("sleep", 4),
                new Job("read", 3)
        );

        assertThat(jobs, is(expect));
    }

    @Test
    public void combSort() {
        List<Job> jobs = new ArrayList<>();

        jobs.add(new Job("read", 5));
        jobs.add(new Job("read", 3));
        jobs.add(new Job("read", 4));

        Comparator<Job> comb = new JobAscByName().thenComparing(new JobAscByPriority());
        jobs.sort(comb);

        List<Job> expect = List.of(
                new Job("read", 3),
                new Job("read", 4),
                new Job("read", 5)
        );

        assertThat(jobs, is(expect));
    }
}