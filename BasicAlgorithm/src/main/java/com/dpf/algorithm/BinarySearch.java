package com.dpf.algorithm;

/**
 * 二分查找
 */
public class BinarySearch {

    public static int search(int[] arr, int left, int right, int value) {
        if (left >= right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (value == arr[mid]){
            return mid;
        } else if (value < arr[mid]) {
            return search(arr, left, mid, value);
        } else {
            return search(arr, mid, right, value);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int index = search(arr, 0, arr.length - 1, 3);
        System.out.print(index);
    }
}
