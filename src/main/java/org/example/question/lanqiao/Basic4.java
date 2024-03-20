package org.example.question.lanqiao;

import java.util.Scanner;

public class Basic4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > max)
                max =num;
            if (num < min){
                min = num;
            }
            sum +=num ;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
