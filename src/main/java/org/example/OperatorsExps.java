package org.example;

public class OperatorsExps {
    public static void main(String args[]){
        //arthematicOprts(10,20);
        //assignmentOprts(10,20);
        //relationalOptrs(10,20);
        //shiftOptrs(10,20);
        //bitwiseOptrs(10,20);
        urnaryopts(10);
        urnaryopts(10);

    }
    public static void arthematicOprts(int a,int b){

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    public static void assignmentOprts(int a,int b){
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);
        System.out.println(a>>=b);
        bitwiseOptrs(10,20);

    }
    public static void bitwiseOptrs(int a,int b){
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
    }
    public static void relationalOptrs(int a,int b){
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a>b);
    }
    public static void shiftOptrs(int a,int b) {
        System.out.println(a >> b);
        System.out.println(a << b);
    }
    public static void urnaryopts(int a) {
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        System.out.println(--a);

    }

}