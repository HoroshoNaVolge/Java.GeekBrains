import java.util.Arrays;

public class Task5_3 implements ITask {

    public void Execute() {
        // Реализовать алгоритм пирамидальной сортировки (HeapSort).

        int[] arr = new int[] { 50, 5, 44, 12, -11, 0, 99, 18 };
        System.out.println("Например дан массив: " + Arrays.toString(arr));

        heapSort(arr);
    }

    private void heapSort(int[] arr) {

        int temp;
        int size = arr.length - 1;

        for (int i = (arr.length / 2); i >= 0; i--) {
            heaper(arr, i, size);
        }
        
        for (int i = size; i >= 0; i--) {
            temp = arr[0];
            arr[0] = arr[size];
            arr[size] = temp;
            size--;
            heaper(arr, 0, size);
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    public static void heaper(int[] arr, int i, int size) {
        int a = 2 * i;
        int b = 2 * i + 1;
        int biggestElem;
        if (a <= size && arr[a] > arr[i]) {
            biggestElem = a;
        } else {
            biggestElem = i;
        }
        if (b <= size && arr[b] > arr[biggestElem]) {
            biggestElem = b;
        }
        if (biggestElem != i) {
            int temp = arr[i];
            arr[i] = arr[biggestElem];
            arr[biggestElem] = temp;
            heaper(arr, biggestElem, size);
        }
    }
}