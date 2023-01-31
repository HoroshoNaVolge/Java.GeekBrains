import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Task1_3 implements ITask {
    static Logger log;
    FileHandler fh;
    XMLFormatter xml;

    public Task1_3() throws IOException {
        log = Logger.getLogger(Task1_3.class.getName());
        fh = new FileHandler("log.xml");
        log.addHandler(fh);
        xml = new XMLFormatter();
        fh.setFormatter(xml);
    }

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
            log.info(operation = GetOperation());

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
            log.info("Введено " + quit);
        }
    }

    private static String GetOperation() {
        String op = new Scanner(System.in).nextLine();
        log.info("Введено " + op);
        return op;
    }

    private static int GetInputInteger() {
        int number;
        try {
            number = new Scanner(System.in).nextInt();
            log.info("Введен " + number);
            return number;
        } catch (InputMismatchException exception) {
            System.out.println("Некорректный ввод, введите целое число:");
            return GetInputInteger();
        }
    }
}
