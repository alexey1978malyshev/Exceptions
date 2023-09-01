package sem1;

public class Exp1 {
    public static void main(String[] args) {
        int[] num = new int[4];
        try {
            System.out.println("До генерации исключения");
            num[7] = 10;
            System.out.println("После генерации исключения");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Выход за границы массива");
        }
        System.out.println("После оператора catch");

    }
}
