import java.io.IOException;
import java.util.ArrayList;

public class Task3_2 implements ITask {

    // Пусть дан произвольный список целых чисел, удалить из него четные числа.
    @Override
    public void Execute() throws SecurityException, IOException {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        System.out.println("Список: " + lst.toString());

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) % 2 == 0) {
                lst.remove(i);
            }
        }

        System.out.println("Список без чётных чисел:: " + lst.toString());
    }
}
