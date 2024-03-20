package org.example.luogu.rumen1;


import java.util.Scanner;

/**
 * B2029 大象喝水
 */
public class demo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int r = scanner.nextInt();
        double vol = h *(3.14*(r*r));
        double res = 0;
        if (20*1000 / vol == 0){
            res = 20*1000 / vol;
        }else
            res = 20*1000 / vol +1;
        System.out.println((int)res);

    }
}
