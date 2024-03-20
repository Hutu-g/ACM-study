package org.example.luogu.rumen2;


import java.util.Scanner;

/**
 * P5711 【深基3.例3】闰年判断
 */
public class demo4 {
    public static void main(String[] args) {
        //如果年份能被4整除但不能被100整除，或者能被400整除，那么这一年就是闰年。
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int res = 0;
        if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
            res = 1;
        System.out.print(res);
    }
}
