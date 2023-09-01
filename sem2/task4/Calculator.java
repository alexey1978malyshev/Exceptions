package sem2.task4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        try {
            if (num1 == 0 || num2 == 0) {
                throw new ZeroMult("Тут не умножают на нуль!!!");
            }
            if (num1 <= 0)
                throw new MinesFromNegativeException("Тут не вычитают из отрицательного!!!");


        }catch (MinesFromNegativeException  | ZeroMult e){
            System.out.println("Errora!!! "+ e.getMessage());
        }

    }

}
