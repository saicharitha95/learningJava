package org.example;

public class satblockexp {
    public static void main(String args[]){
        student std1=new student();
        std1.name="sai";
        std1.marks=98;
        std1.sec="B";
        std1.details();
    }
    static{
        String sec;
        System.out.println("in static");
    }
    static class student{
        String name;
        int marks;
        static String sec;

        public void details(){
            System.out.println(name+" "+marks+" "+sec);
        }
    }

}
