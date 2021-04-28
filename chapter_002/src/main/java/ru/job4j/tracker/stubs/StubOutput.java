package ru.job4j.tracker.stubs;

import ru.job4j.tracker.io.Output;

/**
 * Заглушка для интерфейса Output.
 * @author Evgenii Kapaev
 * @version 1.0
 */
public class StubOutput implements Output {
    private final StringBuilder buffer = new StringBuilder();

    @Override
    public void println(Object obj) {
        if (obj != null) {
            buffer.append(obj.toString());
        } else {
            buffer.append("null");
        }
        buffer.append(System.lineSeparator());
    }

    @Override
    public String toString() {
        return buffer.toString();
    }
}
