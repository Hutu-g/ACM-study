package org.example.warpper;

public class StringMethod {
    public static void main(String[] args) {
        //1.equals()
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));
        //2.equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str2));

        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append("15341");
    }

}
