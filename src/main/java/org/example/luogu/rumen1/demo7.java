package org.example.luogu.rumen1;


import java.util.*;

/**
 * P5705 【深基2.例8】再分肥宅水
 */
public class demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberStr = String.valueOf(scanner.nextFloat()).replace(".","");
        StringBuffer resNum = new StringBuffer(numberStr).reverse().insert(1, ".");
        float res = Float.parseFloat(String.valueOf(resNum));
        System.out.println(res);
    }
}
