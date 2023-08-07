package org.example;

public class WrapperClass {
    public static void main(String args[]){
        int num=8;
        int num2=num;   //autoboxing
        int num3=num2;  //auto unboxing
        System.out.println(num3);
        String str="12";
        int a=Integer.parseInt(str);
        System.out.println(a*2);
    }
}
