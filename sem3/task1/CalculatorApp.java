package sem3.task1;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        String operation = scanner.next();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        try {
            double result = switch (operation) {
                case "+" -> calculator.add(a, b);
                case "-" -> calculator.subtract(a, b);
                case "*" -> calculator.multiply(a, b);
                case "/" -> calculator.divide(a, b);
                default -> throw new InvalidInputException("Неверная операция");
            };
            System.out.println("Результат: " + result);
        } catch (ArithmeticException | InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
