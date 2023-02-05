import java.io.IOException;
import java.util.Scanner;

public class program {

    static ITask task;
    static boolean repeatProgram = true;

    public static void main(String[] args) throws IOException {

        while (repeatProgram) {

            chooseTask(chooseSeminar());

            try {
                task.Execute();
            } catch (NullPointerException e) {
                System.out.println("Программа завершена.");
            }
        }
    }

    private static int chooseSeminar() {
        System.out.println("\nВведите номер семинара: 1, 2 или 3");
        String inputStr = new Scanner(System.in).nextLine();

        switch (inputStr) {
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            default:
                System.out.println("Некорректный ввод, попробуйте снова.");
                return chooseSeminar();
        }
    }

    private static void chooseTask(int seminarNumber) throws IOException {

        if (seminarNumber == 1) {
            System.out.println(
                    "\nСеминар 1.\nВведите номер задачи: 1, 2 или 3.\nДля выхода из программы введите q");
            String inputStr = new Scanner(System.in).nextLine();

            switch (inputStr) {
                case "1":
                    task = new Task1_1();
                    break;
                case "2":
                    task = new Task1_2();
                    break;
                case "3":
                    task = new Task1_3();
                    break;
                case "q":
                    task = null;
                    repeatProgram = false;
                    break;
                default:
                    System.out.println("Некорректный ввод, попробуйте снова.");
                    chooseTask(1);
            }
        }

        else if (seminarNumber == 2) {
            System.out.println(
                    "\nСеминар 2.\nВведите номер задачи: 1, 2 или 4.\nДля выхода из программы введите q");
            String inputStr = new Scanner(System.in).nextLine();

            switch (inputStr) {
                case "1":
                    task = new Task2_1();
                    break;
                case "2":
                    task = new Task2_2();
                    break;
                case "4":
                    task = new Task1_3();
                    System.out.println("\nВ калькулятор добавлен логгер.");
                    break;
                case "q":
                    task = null;
                    repeatProgram = false;
                    break;
                default:
                    System.out.println("Некорректный ввод, попробуйте снова.");
                    chooseTask(2);
            }
        }

        else if (seminarNumber == 3) {
            System.out.println(
                    "\nСеминар 3.\nВведите номер задачи: 1, 2, 3.\nДля выхода из программы введите q");
            String inputStr = new Scanner(System.in).nextLine();

            switch (inputStr) {
                case "1":
                    task = new Task3_1();
                    break;
                case "2":
                    task = new Task3_2();
                    break;
                case "3":
                    task = new Task3_3();
                    break;
            }
        }

        else if (seminarNumber==4){
            System.out.println( "\nСеминар 4.\nВведите номер задачи: 1, 2, 3.\nДля выхода из программы введите q");
        
            String inputStr = new Scanner(System.in).nextLine();

            switch (inputStr) {
                case "1":
                    task = new Task4_1();
                    break;
                case "2":
                    task = new Task4_2();
                    break;
                case "3":
                    task = new Task4_3();
                    break;
        }
    }
}