package org.example.luogu.rumen1;


import java.util.Scanner;

/**
 * P1425 小鱼的游泳时间
 */
public class demo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int start = a * 60 + b;
        int end = c * 60 + d;
        int second = end - start;
        int hours =  second / 60;
        int minutes = second % 60;
        System.out.println(hours+ " "+ minutes);
    }
}
