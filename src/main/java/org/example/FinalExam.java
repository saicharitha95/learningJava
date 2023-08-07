package org.example;

public class FinalExam {    //final class
    public static void main(String args[]){
       final int a=10; //final variable
        System.out.println(a);
        Cal obj=new Cal();

        obj.show();
    }
}
class Cal extends AdvanCal{    //final class
    public void show(){   //final method
        int b=7;
        System.out.println(b);
    }
}
class AdvanCal {
    public void show(){
        System.out.println("in adv");
    }
}
