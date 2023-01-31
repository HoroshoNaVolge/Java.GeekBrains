import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2_2 implements ITask {
    Logger logger = Logger.getLogger(Task2_2.class.getName());
    ConsoleHandler handler = new ConsoleHandler();

    @Override
    public void Execute() {
        // Реализуйте алгоритм сортировки пузырьком числового массива, результат после
        // каждой итерации запишите в лог-файл.

        logger.addHandler(handler);
        SimpleFormatter sFormatter = new SimpleFormatter();
        handler.setFormatter(sFormatter);
        logger.setLevel(Level.INFO);

        int[] arr = new int[] { 5, 10, 2, 6, 14, 88, 3 };

        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    sorted = false;
                }
                logger.info(Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
