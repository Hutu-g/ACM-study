package org.example.other.question;

//        //数组逆序
//        int[] nums = {489,88,8,64,56,487,4,4,65,46,4,7};
//        System.out.println("输入的内容为："+ Arrays.toString(nums));
//        // 对数组进行排序
//        Arrays.sort(nums);
//        // 创建新数组并将排序后的数组按逆序存储
//        int[] reversedArr = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            reversedArr[i] = nums[nums.length - 1 - i];
//        }
//        // 输出逆序后的数组
//        System.out.println("逆序后的数组为：" + Arrays.toString(reversedArr));
//A+B问题
import java.util.Arrays;
import java.util.Scanner;
public class test12 {
    public static void main(String[] args) {
        //A+B问题
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        int i1 = scanner.nextInt();
//        System.out.println(i+i1);

        //数列排序
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
