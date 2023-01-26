import java.util.Scanner;

public class program {

    static ITask task;
    static boolean repeatProgram = true;

    public static void main(String[] args) {

        while (repeatProgram) {
            chooseTask();

            try {
                task.Execute();
            } catch (NullPointerException e) {
                System.out.println("Программа завершена.");
            }
        }
    }

    private static void chooseTask() {
        System.out.println(
                "\nВведите номер задачи: 1, 2 или 3.\nДля выхода из программы введите q");
        String inputStr = new Scanner(System.in).nextLine();

        switch (inputStr) {
            case "1":
                task = new Task1();
                break;
            case "2":
                task = new Task2();
                break;
            case "3":
                task = new Task3();
                break;
            case "q":
                task = null;
                repeatProgram = false;
                break;
            default:
                System.out.println("Некорректный ввод, попробуйте снова.");
                chooseTask();
        }
    }
}