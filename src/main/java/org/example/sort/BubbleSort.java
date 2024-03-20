package org.example.sort;

import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums ={1,3,8,447,784,84,6,44,8,4,54,4,89,4,5,2};
        //System.out.println(Arrays.toString(maoPao(nums)));
        int[] nums2 = new int[9999];
        for (int i = 0; i < 9999; i++) {
            nums2[i] = new Random().nextInt();
        }

        //冒泡排序
        bubbleSort(nums2);
        System.out.println(Arrays.toString(nums2));
    }

    /**
     * 冒泡排序
     * @param nums
     * @return
     */
    public static int[] bubbleSort(int[] nums){
        if (nums.length == 0) return nums;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j+1])
                     swap(nums,j,j+1);
            }
        }
        return nums;
    }

    /**
     * 工具函数：交换i，j 元素
     * @param nums
     * @param i
     * @param j
     */
    public static void swap(int[] nums, int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}