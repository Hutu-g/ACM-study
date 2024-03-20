package org.example.luogu.rumen2;


import java.util.Scanner;

/**
 * P5710 【深基3.例2】数的性质
 */
public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = 0, u = 0, b = 0, z = 0;
        if ((x > 4 && x <= 12) || x % 2 == 0) {
            a = 1;
        }
        if ((x > 4 && x <= 12) || x % 2 == 0) {
            u = 1;
        }
        if ((x <= 4 && x > 12 && x % 2 == 0) || (x > 4 && x <= 12 && x % 2 == 1)) {
            b = 1;
        }
        if ((x < 4 || x > 12) && x % 2 != 0) {
            z = 1;
        }
        System.out.print(a + " " + u + " " + b + " " + z);
    }
}
