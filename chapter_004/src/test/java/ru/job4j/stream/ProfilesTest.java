package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void profileListToAddressList() {
        Profiles profiles = new Profiles();
        List<Address> list = profiles.collect(List.of(
                new Profile(new Address("Moscow", "Krasnopresnenskaya", 2, 1)),
                new Profile(new Address("Sankt-Peterburg", "Vysotnaya", 1, 0)),
                new Profile(new Address("Omsk", "Krachy Put", 1, 1))
        ));
        List<Address> expected = List.of(
                new Address("Moscow", "Krasnopresnenskaya", 2, 1),
                new Address("Omsk", "Krachy Put", 1, 1),
                new Address("Sankt-Peterburg", "Vysotnaya", 1, 0)
        );
        assertThat(list, is(expected));
    }

    @Test
    public void sortingAddress() {
        Profiles profiles = new Profiles();
        List<Address> list = profiles.collect(List.of(
                new Profile(new Address("Moscow", "Krasnopresnenskaya", 2, 1)),
                new Profile(new Address("Sankt-Peterburg", "Vysotnaya", 1, 0)),
                new Profile(new Address("Omsk", "Krachy Put", 1, 1)),
                new Profile(new Address("Novosibirsk", "Sibirskaya", 1, 0)),
                new Profile(new Address("Kaliningrad", "Evropeiskaya", 1, 1))
        ));
        List<Address> expected = List.of(
                new Address("Kaliningrad", "Evropeiskaya", 1, 1),
                new Address("Moscow", "Krasnopresnenskaya", 2, 1),
                new Address("Novosibirsk", "Sibirskaya", 1, 0),
                new Address("Omsk", "Krachy Put", 1, 1),
                new Address("Sankt-Peterburg", "Vysotnaya", 1, 0)
        );
        assertThat(list, is(expected));
    }

    @Test
    public void distinctAddress() {
        Profiles profiles = new Profiles();
        List<Address> list = profiles.collect(List.of(
                new Profile(new Address("Moscow", "Krasnopresnenskaya", 2, 1)),
                new Profile(new Address("Sankt-Peterburg", "Vysotnaya", 1, 0)),
                new Profile(new Address("Omsk", "Krachy Put", 1, 1)),
                new Profile(new Address("Novosibirsk", "Sibirskaya", 1, 0)),
                new Profile(new Address("Kaliningrad", "Evropeiskaya", 1, 1)),
                new Profile(new Address("Novosibirsk", "Sibirskaya", 1, 0)),
                new Profile(new Address("Sankt-Peterburg", "Vysotnaya", 1, 0))
        ));
        List<Address> expected = List.of(
                new Address("Kaliningrad", "Evropeiskaya", 1, 1),
                new Address("Moscow", "Krasnopresnenskaya", 2, 1),
                new Address("Novosibirsk", "Sibirskaya", 1, 0),
                new Address("Omsk", "Krachy Put", 1, 1),
                new Address("Sankt-Peterburg", "Vysotnaya", 1, 0)
        );
        assertThat(list, is(expected));
    }
}