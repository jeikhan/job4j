package ru.job4j.exception;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("User not found!");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] users = {"May", "Hammond", "Clarkson"};
        try {
            indexOf(users, "Stig");
        } catch (ElementNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
