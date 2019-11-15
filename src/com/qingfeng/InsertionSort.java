package com.qingfeng;

/**
 * @author shihangqi
 * @date 2019/11/14 - 10:22
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {5, 1, 11, 30, 12, 6, 8, 10, 35, 4, 20, 9};
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void insertionSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }


        }


    }
}
