package org.example.question.lanqiao;

import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {
        //字母图形
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String arrString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int index =  (i+j) % 26 ;
                System.out.print(arrString.charAt(index));
            }
            System.out.println();
        }
    }
}
