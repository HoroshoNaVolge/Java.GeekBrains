import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task5_2 implements ITask {

    public void Execute() {
        // Пусть дан список сотрудников:Иван Иванов и т.д. Написать программу, которая
        // найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать
        // по убыванию популярности.

        ArrayList<String> list = new ArrayList<String>();

        list.add(0, "Андрей Андреев");
        list.add(1, "Виктор Викторов");
        list.add(2, "Александр Александров");
        list.add(3, "Петр Петров");
        list.add(4, "Виктор Викторов");

        System.out.println("Список: " + list.toString());

        Map<String, Long> result = list.stream().collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));

        System.out.println(result);

        // Как нормально отсортировать не разобрался...
    }
}
