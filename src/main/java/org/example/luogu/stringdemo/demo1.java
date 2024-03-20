package org.example.luogu.stringdemo;

import java.util.*;

public class demo1 {
    /**
     * P1012 [NOIP1998 提高组] 拼数
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(String.valueOf(scanner.next()));
        }
        scanner.close();
        Collections.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

//        // 自定义排序规则
//        Collections.sort(numbers, new Comparator<String>() {
//            public int compare(String number1, String number2) {
//                // 拼接数字，比较number1number2与number2number1的大小
//                return (number2 + number1).compareTo(number1 + number2);
//            }
//        });

        // 特判，如果最大的数字是0，直接返回0
        if (numbers.get(0).equals("0")) {
            System.out.println("0");
            return;
        }

        // 将排序后的数字拼接成字符串
        StringBuilder largestNumber = new StringBuilder();
        for (String number : numbers) {
            largestNumber.append(number);
        }

        // 输出结果
        System.out.println(largestNumber);
    }
}
