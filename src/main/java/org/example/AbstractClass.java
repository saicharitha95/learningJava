package org.example;

public class AbstractClass {
    public static void main(String args[]){
        Bus obj=new Apcrtc(); //we cant create object for abstract class
        obj.type();
        obj.colour();
    }
}
abstract class Bus{ //it's not mandatory that abstarct class should contain abstact method
    public abstract void type(); //method declares,we can declare abstract class as many we want
    public void colour(){    //method defines
        System.out.println("red colour");
    }
}
class Apcrtc extends Bus{
    public void type(){
        System.out.println("govt");  //override the abstract method
    }
}
