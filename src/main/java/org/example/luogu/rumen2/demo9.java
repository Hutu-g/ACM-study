package org.example.luogu.rumen2;


import java.util.Scanner;

/**
 * P5716 【深基3.例9】月份天数
 */
public class demo9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int mouth = scanner.nextInt();
        if (mouth == 1 || mouth == 3 || mouth == 5 || mouth == 7 || mouth == 8 || mouth == 10 || mouth == 12) {
            System.out.println(31);
        } else {
            if (mouth == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(29);
            } else if (mouth == 2) {
                System.out.println(28);
            } else {
                System.out.println(30);
            }
        }
    }
}
