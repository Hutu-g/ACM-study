package org.example.luogu.rumen1;


import java.util.Scanner;

/**
 * P5708 【深基2.习2】三角形面积
 */
public class demo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a+b+c)/2;
        double x = p*(p-a)*(p-b)*(p-c);
        double res = Math.sqrt(x);
        System.out.printf("%.1f\n",res);
    }
}
