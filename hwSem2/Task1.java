package hwSem2;
/* Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с
сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Input the number: ");
        Scanner sc = new Scanner(System.in);
        try {
            int res = sc.nextInt();
            if (res <= 0){
                throw new InvalidNumberException("The number incorrect");
            }
            System.out.println("Correct number");

        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        sc.close();

    }
}
