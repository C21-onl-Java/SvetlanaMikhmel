package ru.teachmeskills.homework11.exercise2;

public class StaticClass {
    public static boolean enterAccount(String login, String password, String confirmPassword) throws WrongLoginExeption, WrongPasswordExeption {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginExeption("Некорректное значение логина");
        }
        if (password.length() > 20 || password.contains(" ") || !containDigit(password)) {
            throw new WrongPasswordExeption("Некорректное значение пароля");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordExeption("Password и confirmPassword не совпадают");
        }
        System.out.println("Регистрация завершена успешно");
        return true;
    }

    private static boolean containDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
