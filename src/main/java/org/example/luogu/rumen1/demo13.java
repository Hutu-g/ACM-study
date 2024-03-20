package org.example.luogu.rumen1;


import java.util.Scanner;

/**
 * P1421 小玉买文具
 */
public class demo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a * 10 + b;
        int res = x /19;
        System.out.println(res);
    }
}
