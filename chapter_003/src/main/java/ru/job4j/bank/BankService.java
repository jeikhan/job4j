package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Задача: разработать модель для банковской системы.
 * В системе можно производить следующие действия:
 * 1. Регистрировать пользователя.
 * 2. Удалять пользователя из системы.
 * 3. Добавлять пользователю банковский счет (у пользователя могут быть несколько счетов).
 * 4. Переводить деньги с одного банковского счета на другой счет.
 *
 * @author Evgen Kapaev
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователей осуществляется в HashMap.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему. Перед этим
     * проверяет - существует ли этот пользователь в системе.
     * @param user модель пользователя содержит номер пасспорта
     * и имя пользователя.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет пользователю новый счёт, предварительно
     * найдя пользователя по паспорту и проверив существование
     * вводимого номера счёта.
     * @param passport номер пасспорта пользователя.
     * @param account номер счёта пользователя.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> currentAccount = users.get(user);
            if (!currentAccount.contains(account)) {
                currentAccount.add(account);
            } else {
                System.out.println("This account already exists!");
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя по пасспорту.
     * @param passport номер паспорта пользователя.
     * @return возвращает имя пользователя или null при его отсутствии.
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счёт пользователя по реквизитам.
     * @param passport номер пасспорта пользователя.
     * @param requisite реквизиты пользователя.
     * @return возвращает номер счёта либо null при его отсутствии.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод осуществляет перевод денежных средств с одного счета
     * на другой.
     * @param srcPassport номер пасспорта отправителя.
     * @param srcRequisite реквизиты счёта отправителя.
     * @param destPassport номер пасспорта получателя.
     * @param destRequisite реквизиты счёта получателя.
     * @param amount размер денежных средств.
     * @return возвращает true(успешно) либо false(неудачно)
     * как результат перевода средств.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            result = true;
        }
        return result;
    }
}
