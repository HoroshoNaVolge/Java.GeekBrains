import java.util.LinkedList;

public class Task4_1 implements ITask {

    public void Execute() {
        // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
        // вернет “перевернутый” список.

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Изначальный список: " + list.toString());
        System.out.println("Перевёрнутый список: " + ReverseList(list).toString());
    }

    private LinkedList<Integer> ReverseList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> reversedList = new LinkedList<Integer>();

        for (int i = linkedList.size(); i >= 1; i--) {
            reversedList.add(linkedList.getLast());
            linkedList.remove(linkedList.getLast());
        }
        return reversedList;
    }

}
