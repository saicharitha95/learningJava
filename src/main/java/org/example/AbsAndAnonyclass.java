package org.example;

public class AbsAndAnonyclass {
    public static void main(String args[]){
        Flowers obj=new Flowers(){
            public void smell(){

               // System.out.println("good or bad");
            }
        };
        obj.smell();
    }
}
abstract class Flowers{
    public abstract void smell();

}
