package org.example.question;

import java.util.Map;
import java.util.Scanner;

public class MC101Test101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //设置地图
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] map = new int[n][m];
        //初始位置
        int[] position = {scanner.nextInt() - 1, scanner.nextInt() - 1};
        //设置障碍
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            map[row][col] = 1;
        }
        //移动
        String moves = scanner.next();
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'L':
                    while (position[1] > 0 && map[position[0]][position[1] - 1] == 0)
                        position[1]--;
                    break;
                case 'R':
                    while (position[1] < m - 1 && map[position[0]][position[1] + 1] == 0)
                        position[1]++;
                    break;
                case 'U':
                    while (position[0] > 0 && map[position[0] - 1][position[1]] == 0)
                        position[0]--;
                    break;
                case 'D':
                    while (position[0] < n - 1 && map[position[0] + 1][position[1]] == 0)
                        position[0]++;
                    break;
            }
        }
        //最终的位置
        System.out.println((position[0] + 1) + " " + (position[1] + 1));
    }
}
