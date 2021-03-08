package ru.job4j.collect;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void ascByName() {
        List<Job> jobs = new ArrayList<>();

        jobs.add(new Job("write", 5));
        jobs.add(new Job("read", 3));
        jobs.add(new Job("sleep", 4));

        jobs.sort(new JobAscByName());

        List<Job> expect = Arrays.asList(
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

        List<Job> expect = Arrays.asList(
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

        List<Job> expect = Arrays.asList(
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

        List<Job> expect = Arrays.asList(
                new Job("write", 5),
                new Job("sleep", 4),
                new Job("read", 3)
        );

        assertThat(jobs, is(expect));
    }

    @Test
    public void combSort() {
        List<Job> jobs = new ArrayList<>();

        jobs.add(new Job("write", 5));
        jobs.add(new Job("read", 3));
        jobs.add(new Job("read", 4));

        Comparator<Job> comb = new JobAscByName().thenComparing(new JobAscByPriority());
        Collections.sort(jobs, comb);

        List<Job> expect = Arrays.asList(
                new Job("read", 3),
                new Job("read", 4),
                new Job("write", 5)
        );

        assertThat(jobs, is(expect));
    }
}