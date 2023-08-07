package org.example;

public class AnonymousInnerClass {
    public static void main(String args[]){
        People obj=new People(){
            public void gender(){
                System.out.println("female");
            }
            public void age(){
                System.out.println("20");
            }
        };
        obj.gender();
        obj.age();
    }
}
class People{
    public void gender(){
        System.out.println("male or female");
    }
    public void age(){
        System.out.println("30");
    }
}
