package org.example.question.lanqiao;


import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        //闰年判断
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        if (years % 4 == 0 && years % 100 !=0  || years % 400 == 0){
            System.out.println("yes");
        }else
            System.out.println("no");
//        //01A+B问题
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        int i1 = scanner.nextInt();
//        System.out.println(i+i1);
    }
}
