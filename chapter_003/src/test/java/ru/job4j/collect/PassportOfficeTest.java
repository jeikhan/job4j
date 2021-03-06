package ru.job4j.collect;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;

public class PassportOfficeTest {
    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Evgenii Kapaev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void whenAddFalse() {
        Citizen citizen = new Citizen("2f44a", "Evgenii Kapaev");
        Citizen citizen1 = new Citizen("2f44a", "Jeremy Clarkson");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertFalse(office.add(citizen1));
    }
}