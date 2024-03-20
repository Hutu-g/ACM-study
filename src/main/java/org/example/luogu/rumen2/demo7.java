package org.example.luogu.rumen2;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * P5714 【深基3.例7】肥胖问题
 */
public class demo7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double h = scanner.nextDouble();
        double bmi = m / (h * h);
        DecimalFormat df = new DecimalFormat("0.######");
        String bmiStr = df.format(bmi);
        double bmiDou = Double.parseDouble(bmiStr);
        if (bmiDou < 18.5)
            System.out.println("Underweight");
        if (bmiDou >= 18.5 && bmiDou < 24)
            System.out.println("Normal");
        if (bmiDou>=24) {
            System.out.println(bmiStr);
            System.out.println("Overweight");
        }

    }
}
