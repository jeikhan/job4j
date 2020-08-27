package ru.job4j.tracker.item;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Используем композицию.
 */
public class TrackerSingleTest {
    private TrackerSingleEnum trackerSingleEnum = TrackerSingleEnum.INSTANCE;
    private TrackerSingleLazy trackerSingleLazy = TrackerSingleLazy.getInstance();
    private TrackerSingleEager trackerSingleEager = TrackerSingleEager.getInstance();
    private TrackerSinglePrivate trackerSinglePrivate = TrackerSinglePrivate.getInstance();

    @Test
    public void whenTrackerSingleEnum() {
        assertEquals(trackerSingleEnum, trackerSingleEnum);
    }

    @Test
    public void whenTrackerSingleLazy() {
        assertEquals(trackerSingleLazy, trackerSingleLazy);
    }

    @Test
    public void whenTrackerSingleEager() {
        assertEquals(trackerSingleEager, trackerSingleEager);
    }

    @Test
    public void whenTrackerSinglePrivate() {
        assertEquals(trackerSinglePrivate, trackerSinglePrivate);
    }
}