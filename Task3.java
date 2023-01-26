import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 implements ITask {
    int firstNumber;
    int secondNumber;
    String operation;
    boolean active = true;

    public void Execute() {

        while (active) {
            System.out.println("Задача 3. Калькулятор.");
            System.out.println("Введите первое целое число: ");
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
                    try {
                        System.out.println(firstNumber / secondNumber);
                    } catch (ArithmeticException e) {
                        System.out.println("Упс! Делить на ноль не будем, чтобы не скукожить вселенную. ");
                    }
                    break;

                default:
                    System.out.println("Некорректная операция, повторите ввод сначала:");
                    Execute();
                    break;
            }

            AskToQuit();
        }
    }

    private void AskToQuit() {
        System.out.println("Для выхода из калькулятора введите q, для продолжения любой другой символ или enter");
        String quit = new Scanner(System.in).nextLine();
        if (quit.toLowerCase().equals("q")) {
            active = false;
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
