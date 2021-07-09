package ru.job4j.collect;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class NotifyAccountTest {
    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Evgenii Kapaev", "eDer3432f"),
                new Account("142", "Evgenii Kapaev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Evgenii Kapaev", "eDer3432f"),
                        new Account("142", "Evgenii Kapaev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sentWithDuplicate() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Evgenii Kapaev", "eDer3432f"),
                new Account("142", "Evgenii Kapaev", "000001"),
                new Account("123", "Evgenii Kapaev", "eDer3432f")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Evgenii Kapaev", "eDer3432f"),
                        new Account("142", "Evgenii Kapaev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}