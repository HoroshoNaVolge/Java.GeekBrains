import java.util.InputMismatchException;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        chooseTask();
    }

    private static void chooseTask() {
        System.out.println("Введите номер задачи: 1, 2 или 3");
        switch (new Scanner(System.in).nextLine()) {
            case "1":
                task1();
            case "2":
                task2();
            case "3":
                task3();
        }
    }

    private static void task2() {

    }

    private static void task1() {
        int number = 0;
        int sum = 0;
        int factorial = 1;

        System.out.println("Введите число:");

        try {
            number = new Scanner(System.in).nextInt();

        } catch (InputMismatchException exception) {
            System.out.println("Некорректный ввод, попробуйте снова");
            task1();
        }

        for (int i = number; i >= 1; i--) {
            sum += i;
            factorial *= i;
        }
        System.out.println("Сумма чисел от 1 до " + number + ": " + sum);
        System.out.println("Факториал числа " + number + ": " + factorial);
    }

    private static void task3() {
        int firstNumber;
        int secondNumber;
        String operation;
        boolean active = true;

        while (active) {
            System.out.println("Работает калькулятор. Введите первое целое число: ");
            firstNumber = GetInputInteger();

            System.out.println("Введите второе целое число: ");
            secondNumber = GetInputInteger();

            System.out.println("Введите символ операции: + - * /");
            operation = GetOperation();

            switch (operation) {
                case "+":
                    System.out.print("Сумма " + firstNumber + " и " + secondNumber + " = ");
                    System.out.println(firstNumber + secondNumber);
                    break;

                case "-":
                    System.out.print("Разница " + firstNumber + " и " + secondNumber + " = ");
                    System.out.println(firstNumber - secondNumber);
                    break;

                case "*":
                    System.out.print("Произведение " + firstNumber + " и " + secondNumber + " = ");
                    System.out.println(firstNumber * secondNumber);
                    break;

                case "/":
                    System.out.print("Деление " + firstNumber + " и " + secondNumber + " = ");
                    System.out.println(firstNumber / secondNumber);
                    break;

                default:
                    System.out.println("Некорректная операция, повторите ввод сначала:");
                    break;
            }
        }

    }

    private static String GetOperation() {
        String op = new Scanner(System.in).nextLine();
        return op;
    }

    private static int GetInputInteger() {
        int number;
        try {
            number = new Scanner(System.in).nextInt();
            return number;
        } catch (InputMismatchException exception) {
            System.out.println("Некорректный ввод, введите целое число:");
            return GetInputInteger();
        }
    }
}