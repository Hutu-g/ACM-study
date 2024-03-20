package org.example.question.lanqiao;

import java.util.ArrayList;
import java.util.Scanner;

public class Basic5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (sequence[i] == target){
                position = i +1;
                break;
            }
        }
        System.out.println(position);

    }
}
