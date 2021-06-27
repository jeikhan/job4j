package ru.job4j.exception;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (login.equals(user.getUserName())) {
                result = user;
                break;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("User not found!");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User not valid!");
        }
        if (user.getUserName().length() < 3) {
            throw new UserInvalidException("User not valid: length of name less than 3 symbols...");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Stig", true)
        };
        try {
            User user = findUser(users, "Stig");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException exception) {
            exception.printStackTrace();
        } catch (UserNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
