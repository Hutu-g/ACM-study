package org.example.other.sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums2 = new int[9999];
        for (int i = 0; i < 9999; i++) {
            nums2[i] = new Random().nextInt();
        }
        //选择排序
        System.out.println(Arrays.toString(selectionSort(nums2)));
    }

    /**
     * 选择排序
     * @param nums
     * @return
     */
    public static int[] selectionSort(int[] nums){
        if (nums.length == 0) return nums;
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex])
                    minIndex = j;//记录最小值下标
            }
            swap(nums,i,minIndex);
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
