import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        double[] list = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        bubbleSort(list);
        System.out.println("Final sorted array: ");
        System.out.println(Arrays.toString(list));
    }

    public static void bubbleSort(double[] list) {
        boolean changed;
        do {
            changed = false;
            for (int j = 0; j < list.length - 1; j++)
                if (list[j] > list[j + 1]) {
                    swap(list, j, j+1);
                    changed = true;
                }
        } while (changed);
    }

    public static void swap(double[] list, int index1, int index2) {
        double temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }
}
