package org.example.question.lanqiao;

import java.util.Arrays;
import java.util.Scanner;

public class Basic13 {
    public static void main(String[] args) {
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
