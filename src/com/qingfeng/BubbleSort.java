package com.qingfeng;

/**
 * @author shihangqi
 * @date 2019/11/14 - 9:53
 */
public class BubbleSort {

    public static void main(String[] args) {

        int []array = {5,1,11,30,12,6,8,10,35,4,20,9};
        bubbleSort(array);

        for (int i = 0 ; i<array.length;i++) {
            System.out.println(array[i]);
        }

    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true;
            for (int j = array.length - 1; j > i; j--) {
                if(array[j-1]>array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    flag = false;
                }
            }
            if (flag == true){
                return;
            }
        }

    }


}
