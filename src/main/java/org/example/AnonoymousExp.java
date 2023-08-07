package org.example;

public class AnonoymousExp {
    public static void main(String args[]){
        new A().show();//anonoymous object,it doesnot refer any object name.

    }

}
class A{
    public A(){

        System.out.println("in object");
    }
    public void show(){
        System.out.println("in A");
    }
}
