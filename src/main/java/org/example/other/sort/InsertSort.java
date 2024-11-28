package org.example.other.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] nums ={1,3,8,447,784,84,6,44,8,4,54,4,89,4,5,2};
        System.out.println(Arrays.toString(insertSort(nums)));

    }
    /**
     * 选插排序
     * @param nums
     * @return
     */
    public static int[] insertSort(int[] nums){
        if (nums.length == 0) return nums;
        for (int i = 1; i < nums.length; i++) {
            int curValue = nums[i];;
            int preValue = i-1;
            while (preValue >= 0 && curValue < nums[preValue]){
                nums[preValue + 1] = nums[preValue];
                preValue--;
            }
            nums[preValue+1] =curValue;
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
