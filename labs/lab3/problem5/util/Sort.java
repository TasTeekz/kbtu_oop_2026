package lab3.problem5.util;

import java.util.Arrays;

public class Sort {

    public static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static <E extends Comparable<E>> int partition(E[] array, int low, int high) {
        E pivot = array[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public static <E extends Comparable<E>> void quickSort(E[] array, int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);

            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
    }

    private static <E extends Comparable<E>> void merge(E[] array, int l, int m, int r) {
        E[] left = Arrays.copyOfRange(array, l, m + 1);
        E[] right = Arrays.copyOfRange(array, m + 1, r + 1);

        int i = 0, j = 0, k = l;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static <E extends Comparable<E>> void mergeSort(E[] array, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);

            merge(array, l, m, r);
        }
    }
}