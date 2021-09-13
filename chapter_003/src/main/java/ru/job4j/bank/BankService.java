package ru.job4j.bank;

import java.util.*;

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
     *
     * @param user модель пользователя содержит номер пасспорта
     *             и имя пользователя.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет пользователю новый счёт, предварительно
     * найдя пользователя по паспорту и проверив существование
     * вводимого номера счёта.
     *
     * @param passport номер пасспорта пользователя.
     * @param account  номер счёта пользователя.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> currentAccount = users.get(user.get());
            if (!currentAccount.contains(account)) {
                currentAccount.add(account);
            } else {
                System.out.println("This account already exists!");
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя по пасспорту.
     *
     * @param passport номер паспорта пользователя.
     * @return возвращает имя пользователя или null при его отсутствии.
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет счёт пользователя по реквизитам.
     *
     * @param passport  номер пасспорта пользователя.
     * @param requisite реквизиты пользователя.
     * @return возвращает номер счёта либо null при его отсутствии.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
    }

    /**
     * Метод осуществляет перевод денежных средств с одного счета
     * на другой.
     *
     * @param srcPassport   номер пасспорта отправителя.
     * @param srcRequisite  реквизиты счёта отправителя.
     * @param destPassport  номер пасспорта получателя.
     * @param destRequisite реквизиты счёта получателя.
     * @param amount        размер денежных средств.
     * @return возвращает true(успешно) либо false(неудачно)
     * как результат перевода средств.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (src.isPresent() && dest.isPresent()) {
            if (src.get().getBalance() >= amount) {
                src.get().setBalance(src.get().getBalance() - amount);
                dest.get().setBalance(dest.get().getBalance() + amount);
                result = true;
            }
        }
        return result;
    }
}
