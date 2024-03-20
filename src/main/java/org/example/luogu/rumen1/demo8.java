package org.example.luogu.rumen1;


import java.util.Scanner;

/**
 * P5705 【深基2.例7】数字反转
 */
public class demo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        int n = scanner.nextInt();
        double v = t / n;
        System.out.printf("%.3f\n",v);
        System.out.println(n*2);

    }
}
