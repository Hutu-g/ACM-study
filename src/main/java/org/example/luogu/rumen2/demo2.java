package org.example.luogu.rumen2;


import java.util.Scanner;

/**
 * P5709 【深基2.习6】Apples Prologue / 苹果和虫子
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        int res;
        if (m*t < s){
            res = 0;
        }else {
            //向上取整
            double k = (double) s/t;
            res = m-(int)Math.ceil(k);
        }
        System.out.println(res);
        scanner.close();
    }
    //首先是吃完了剩下0个苹果
    //其次一个坑点是剩下几个完整的苹果，吃一口就算不完整了
    //所以是k代表被吃过的苹果，要向上取整
    //答案为 完整苹果数=苹果数-被吃过的苹果
}
