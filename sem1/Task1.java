package sem1;
/*Напишите программу, которая запрашивает у пользователя два числа и выводит
 результат их деления. Если пользователь вводит некорректные данные
 (например, буквы или делитель равен нулю), программа должна выводить сообщение
  "Ошибка" и просить пользователя ввести числа заново.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        int dividend = 0;
        int divisor = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the dividend: ");
                dividend = scanner.nextInt();

                System.out.print("Enter the divisor: ");
                divisor = scanner.nextInt();

                double result = (double) dividend / divisor;
                System.out.println("Result: " + result);

                validInput = true; // Введены корректные числа, выходим из цикла
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль недопустимо.");
                scanner.nextLine(); // Очистка буфера ввода
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите числа.");
                scanner.nextLine(); // Очистка буфера ввода
            }
        }
        int e = Integer.parseInt("100");

        scanner.close();
    }
}