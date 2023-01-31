public class Task1_2 implements ITask {

    public void Execute() {
        System.out.println("Задача 2.  Вывести все простые числа от 1 до 1000");
        System.out.println("Простые числа от 1 до 1000: ");
        for (int i = 0; i < 1001; i++) {
            if (isSimple(i)) {
                System.out.print(i + " ");
            }
        }
    }

    boolean isSimple(int i) {
        if (i == 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int j = 5;
        while (j * j <= i) {
            if (i % j == 0 || i % (j + 2) == 0)
                return false;
            j += 6;
        }
        return true;
    }
}
