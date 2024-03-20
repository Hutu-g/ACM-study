package org.example.luogu.rumen2;


import java.util.Scanner;

/**
 * P5712 【深基3.例4】Apples
 */
public class demo5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x==1){
            System.out.print("Today, I ate "+x+" apple.");
        }else if(x==0){
            System.out.print("Today, I ate "+0+" apple.");
        }else
            System.out.print("Today, I ate "+x+" apples.");
    }
}
