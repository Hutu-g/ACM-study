package org.example.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums ={84,6,44,8,4,54,4,89,4,5,2};
        System.out.println(Arrays.toString(quickSort(nums,0, nums.length-1)));

    }
    /**
     * 快速排序
     * @param nums
     * @return
     */
    public static int[] quickSort(int[] nums,int start, int end){
        if (start >= end) return nums;

        int point = findP(nums, start, end);
        quickSort(nums, start, point-1);
        quickSort(nums, point+1, end);
        return nums;
    }
    /**
     * 寻找基准点
     * @param nums
     * @param start
     * @param end
     * @return
     */
    public static int findP(int[] nums,int start, int end){
        int i = start, j = end;
        while (i < j){
            while (i < j && nums[j] >= nums[start])
                j--;
            while (i < j && nums[i] <= nums[start])
                i++;
            swap(nums, i, j);
        }
        swap(nums, start, i);
        return i;
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
