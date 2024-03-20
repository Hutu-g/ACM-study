package org.example.luogu.rumen1;


import java.util.Scanner;

/**
 * P1421 小玉买文具
 */
public class demo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int res = (int) (a*0.2 + b*0.3 +c*0.5);
        System.out.println(res);
    }
}
