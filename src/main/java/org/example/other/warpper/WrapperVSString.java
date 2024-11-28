package org.example.other.warpper;

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类  Integer -》 String
        Integer i = 100;
        //1.
        String str1 = i + "";
        //2.
        String str2 = i.toString();
        //3.
        String str3 = String.valueOf(i);

        //String -》 包装类  Integer
        String str4 = "12345";
        Integer int1 = Integer.parseInt(str4);
        Integer int2 = new Integer(str4);

        //Number

    }
}
