import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Task3_3 implements ITask {

    // Пусть дан произвольный список целых чисел, удалить из него четные числа.
    //
    @Override
    public void Execute() throws SecurityException, IOException {

        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        System.out.println("Список: " + lst.toString());
        System.out.println("Максимальное: " + Collections.max(lst));
        System.out.println("Минимальное значение: " + Collections.min(lst));
        System.out.println("Среднее арифм. :" + average(lst));

    }

    private double average(ArrayList<Integer> lst) {
        double sum = 0;

        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i);
        }
        return sum / lst.size();
    }

}
