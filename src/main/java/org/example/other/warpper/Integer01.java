package org.example.other.warpper;

public class Integer01 {
    public static void main(String[] args) {
        //int 与 Integer 的装箱与拆箱
        //--------手动 ---------
        //装箱 wrapper -》 int
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer i1 = Integer.valueOf(n1);
        //手动拆箱  int -》wrapper
        int intValue = integer.intValue();

        //--------自动 ---------
        //装箱
        int n2 = 200;
        Integer integer1 = n2; //integer.intValue(n2);
        //拆箱
        int n3 = integer1;


    }
}
