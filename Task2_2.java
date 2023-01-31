import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Task2_2 implements ITask {

    @Override
    public void Execute() throws SecurityException, IOException {
        // Реализуйте алгоритм сортировки пузырьком числового массива, результат после
        // каждой итерации запишите в лог-файл.
        Logger logger = Logger.getLogger(Task2_2.class.getName());
        FileHandler handler = new FileHandler("log_calc.xml");
        
        logger.addHandler(handler);
        XMLFormatter xml = new XMLFormatter();
        handler.setFormatter(xml);

        int[] arr = new int[] { 5, 10, 2, 6, 14, 88, 3 };
        System.out.println(Arrays.toString(arr));

        int temp;
        boolean sorted = false;
        int changesCount = 0;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    logger.info("Замена №" + ++changesCount + " " + arr[i] + " > " + arr[i+1]);
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
