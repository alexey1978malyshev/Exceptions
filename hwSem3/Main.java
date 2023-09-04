package hwSem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type the password");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();

        try {
            PasswordVerifier.passwordVerifer(password);
        } catch (PasswordValidException e) {
            throw new RuntimeException(e);
        }
    }
}
