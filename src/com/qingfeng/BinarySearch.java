package com.qingfeng;

/**
 * @author shihangqi
 * @date 2019/11/14 - 9:32
 */
public class BinarySearch {

    public static void main(String[] args) {
        int []array = {1,3,5,7,8,9,10,15,17,19,20,25};

        System.out.println(binarySearch(array, 9));
    }

    public static int binarySearch(int []array,int key){

        int low = 0;
        int higt = array.length-1;
        int mid;

        while (low<=higt){
            mid = (low+higt)/2;
            if(array[mid] == key){
                return mid;
            }
            if(array[mid] > key){
                higt = mid - 1;
            }
            if (array[mid] < key) {
                low = mid + 1;
            }
        }

        return -1;
    }


}
