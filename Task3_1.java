import java.io.IOException;
import java.util.Arrays;

public class Task3_1 implements ITask {

    // Реализовать алгоритм сортировки слиянием.
    // К вопросу про оверрайд :) автогенерируется при реализации интерфейса ITask.
    @Override
    public void Execute() throws SecurityException, IOException {
        int[] arr = new int[] { 10, 1, 5, 12, 15, 88 };
        System.out.println("\nМассив до сортировки: " + Arrays.toString(arr));
        System.out.println("Массив после сортировки слиянием: " + Arrays.toString(mergeSort(arr)));
    }

    private int[] mergeSort(int[] array) {
        int[] buff1 = Arrays.copyOf(array, array.length);
        int[] buff2 = new int[array.length];
        int[] res = mergeSortNext(buff1, buff2, 0, array.length);
        return res;
    }

    private int[] mergeSortNext(int[] buff1, int[] buff2, int firstIndex, int lastIndex) {
        if (firstIndex >= lastIndex - 1) {
            return buff1;
        }

        int mid = firstIndex + (lastIndex - firstIndex) / 2;
        int[] sorted1 = mergeSortNext(buff1, buff2, firstIndex, mid);
        int[] sorted2 = mergeSortNext(buff1, buff2, mid, lastIndex);

        int index1 = firstIndex;
        int index2 = mid;
        int neededIndex = firstIndex;

        int[] result = sorted1 == buff1 ? buff2 : buff1;
        while (index1 < mid && index2 < lastIndex) {
            result[neededIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < mid) {
            result[neededIndex++] = sorted1[index1++];
        }
        while (index2 < lastIndex) {
            result[neededIndex++] = sorted2[index2++];
        }
        return result;
    }
}
