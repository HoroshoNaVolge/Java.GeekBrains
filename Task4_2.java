import java.util.LinkedList;

public class Task4_2 implements ITask {

    LinkedList<Integer> queueAsLinkedList;

    public void Execute() {
        // Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() -
        // помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
        // очереди и удаляет его, first() - возвращает первый элемент из очереди, не
        // удаляя.

        queueAsLinkedList = new LinkedList<Integer>();

        queueAsLinkedList.add(7);
        queueAsLinkedList.add(8);
        queueAsLinkedList.add(9);

        System.out.println("Изначальный список из двух элементов: " + queueAsLinkedList.toString());

        enqueue(queueAsLinkedList, 10);
        System.out.println("добавлен элемент '10' в конец очереди: " + queueAsLinkedList.toString());

        System.out.println("Возвращен и удален первый элемент " + dequeue(queueAsLinkedList) + " из очереди: "
                + queueAsLinkedList.toString());
        System.out.println("Возвращён первый элемент " + first(queueAsLinkedList) + " в очереди: "
                + queueAsLinkedList.toString());
    }

    private void enqueue(LinkedList<Integer> ll, int value) {
        ll.addLast(value);
    }

    private int dequeue(LinkedList<Integer> ll) {
        int firstElem = ll.getFirst();
        ll.remove(ll.getFirst());
        return firstElem;
    }

    private int first(LinkedList<Integer> ll) {
        return ll.getFirst();
    }

}
