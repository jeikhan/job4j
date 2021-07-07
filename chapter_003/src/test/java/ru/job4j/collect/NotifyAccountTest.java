package ru.job4j.collect;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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
}