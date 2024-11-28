package org.example.other.arrays;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class arraysDemo1 {
    public static void main(String[] args) {
        Integer[] nums ={1,3,8,447,784,84,6,44,8,4,54,4,89,4,5,2};
        Integer[] nums2 ={1,3,8,447,784,84,6,44,8,4,54,4,89,4,5,2};
        System.out.println("未操作前:"+Arrays.toString(nums));

        //Arrays.sort
        //Arrays.sort(nums);
        //Arrays.sort(nums2);
        //System.out.println(Arrays.toString(nums));

        //Arrays.binarySearch
        //System.out.println(Arrays.binarySearch(nums, 447));

        //Arrays.equals
        //System.out.println(Arrays.equals(nums, nums2));

        //Arrays.fill
        //Arrays.fill(nums,6);
        //System.out.println("操作后:"+ Arrays.toString(nums));

        //Arrays.copyOf
        //int[] newNums = Arrays.copyOf(nums, nums.length-10);
        //System.out.println(Arrays.toString(newNums));

        //copyOfRange(Object[] a,int start,int end)
        //int[] copiedOfRange = Arrays.copyOfRange(nums, 1, 3);
        //System.out.println(Arrays.toString(copiedOfRange));
        System.out.println(Arrays.hashCode(nums));

        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(nums));


    }

}
