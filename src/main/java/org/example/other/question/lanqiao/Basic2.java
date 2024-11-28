package org.example.other.question.lanqiao;

public class Basic2 {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            String binary = Integer.toBinaryString(i);
            while (binary.length() < 5 ){
                binary = "0" + binary;
            }
            System.out.println(binary);
        }
    }
}
