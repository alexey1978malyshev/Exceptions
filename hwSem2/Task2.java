package hwSem2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Input first number: ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.println("Input first number: ");

        try{
            int secondNum = sc.nextInt();
            if (secondNum == 0) {
                throw new DivisionByZeroException("Can`t zero divide..");
            }
            System.out.println(firstNum /secondNum);

        }catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
