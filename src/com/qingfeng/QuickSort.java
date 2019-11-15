package com.qingfeng;

/**
 * @author shihangqi
 * @date 2019/11/14 - 10:43
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] array = {5, 1, 11, 30, 12, 6, 8, 10, 35, 4, 20, 9};
        QuickSort(array, 0, 11);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void QuickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotpos = partition(array, low, high);
            QuickSort(array, low, pivotpos - 1);
            QuickSort(array, pivotpos + 1, high);
        }
    }


    public static int partition(int[] array, int low, int high) {

        int pivot = array[low];

        while (low < high) {
            while (low < high && array[high] >= pivot) --high;
            array[low] = array[high];
            while (low < high && array[low] <= pivot) ++low;
            array[high] = array[low];
        }
        array[low] = pivot;
        return low;

    }


}
