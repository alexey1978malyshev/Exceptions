package hwSem3.task1;
/*Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)

Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и
проверяет его на соответствие следующим правилам:

Пароль должен быть не менее 8 символов.
Пароль должен содержать хотя бы одну цифру.
Пароль должен содержать хотя бы одну заглавную букву.
Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.*/

public class PasswordVerifier {
    public static void passwordVerifer(String password) throws PasswordValidException {
        try {
            if (checkCapitalLetters(password) && checkNumbersInPassword(password) && password.length() >= 8) {
                System.out.println("Password is valid!");
            } else {
                throw new PasswordValidException("Password length can't be less 8 symbols");
            }

        } catch (PasswordValidException e) {
            System.out.println(e.getMessage());
        }
    }

    //проверка на наличие цифр в строке:
    private static boolean checkNumbersInPassword(String password) throws PasswordValidException {
        boolean check = false;
        char[] checkArray = password.toCharArray();
        for (char symbol : checkArray) {
            if (Character.isDigit(symbol)) {
                check = true;
            }
        }
        if (!check) {
            throw new PasswordValidException("There are no digits in password.. try again");
        }
        return true;

    }
    //проверка на наличие заглавных букв в строке:
    private static boolean checkCapitalLetters(String password) throws PasswordValidException {
        boolean check = false;
        char[] checkArray = password.toCharArray();
        for (char symbol : checkArray) {
            if (Character.isUpperCase(symbol)) {
                check = true;
            }
        }
        if (!check) {
            throw new PasswordValidException("There are no capital letters in password.. try again");
        }
        return true;
    }


}


