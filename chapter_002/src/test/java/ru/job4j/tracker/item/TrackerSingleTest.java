package ru.job4j.tracker.item;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Используем композицию.
 */
public class TrackerSingleTest {

    @Test
    public void whenTrackerSingleEnum() {
        TrackerSingleEnum trackerSingleEnum1 = TrackerSingleEnum.INSTANCE;
        TrackerSingleEnum trackerSingleEnum2 = TrackerSingleEnum.INSTANCE;
        assertEquals(trackerSingleEnum1, trackerSingleEnum2);
    }

    @Test
    public void whenTrackerSingleLazy() {
        TrackerSingleLazy trackerSingleLazy1 = TrackerSingleLazy.getInstance();
        TrackerSingleLazy trackerSingleLazy2 = TrackerSingleLazy.getInstance();
        assertEquals(trackerSingleLazy1, trackerSingleLazy2);
    }

    @Test
    public void whenTrackerSingleEager() {
        TrackerSingleEager trackerSingleEager1 = TrackerSingleEager.getInstance();
        TrackerSingleEager trackerSingleEager2 = TrackerSingleEager.getInstance();
        assertEquals(trackerSingleEager1, trackerSingleEager2);
    }

    @Test
    public void whenTrackerSinglePrivate() {
        TrackerSinglePrivate trackerSinglePrivate1 = TrackerSinglePrivate.getInstance();
        TrackerSinglePrivate trackerSinglePrivate2 = TrackerSinglePrivate.getInstance();
        assertEquals(trackerSinglePrivate1, trackerSinglePrivate2);
    }
}