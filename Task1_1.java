import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_1 implements ITask{
    int number = 0;
    int sum = 0;
    int factorial = 1;

    public void Execute() {
        System.out.println("Выполняется задача 1. Вычислить сумму чисел от 1 до n и факториал n! (произведение чисел от 1 до n)");
        System.out.println("Введите число n:");

        try {
            number = new Scanner(System.in).nextInt();

        } catch (InputMismatchException exception) {
            System.out.println("Некорректный ввод, попробуйте снова");
            Execute();
        }

        for (int i = number; i >= 1; i--) {
            sum += i;
            factorial *= i;
        }
        System.out.println("Сумма чисел от 1 до " + number + ": " + sum);
        System.out.println("Факториал числа " + number + ": " + factorial);
    }
}