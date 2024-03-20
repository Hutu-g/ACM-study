package org.example.luogu.rumen2;


import java.util.Scanner;

/**
 * P5713 【深基3.例5】洛谷团队系统
 */
public class demo6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = x * 5;
        int b = 11 + x * 3;
        if (a<b){
            System.out.println("Local");
        }else
            System.out.println("Luogu");
    }
}
