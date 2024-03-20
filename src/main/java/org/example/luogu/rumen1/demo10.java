package org.example.luogu.rumen1;


import java.util.Scanner;

/**
 * P5707 【深基2.例12】上学迟到
 */
public class demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int v = scanner.nextInt();
        int t = 0;
        if (s%v == 0){
            t = s/v;
        }else if (s%v >=0.5) {
            t = s / v + 1;
        }else
            t = s/v;

        int timeSecond = 8 * 60 - (t + 10);
        int hours =  timeSecond / 60;
        int minutes = timeSecond % 60;

        String HH = String.format("%02d", hours); // 格式化为两位数的小时
        String MM = String.format("%02d", minutes); // 格式化为两位数的分钟
        System.out.println(HH + ":" + MM);
    }
}
