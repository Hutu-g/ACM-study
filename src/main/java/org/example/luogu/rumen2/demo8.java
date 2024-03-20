package org.example.luogu.rumen2;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 	【深基3.例8】三位数排序
 */
public class demo8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] num = {0,1 ,2} ;
        for (int i = 0; i < 3; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        scanner.close();
        System.out.println(num[0] + " " + num[1] + " " + num[2]);

    }
}
