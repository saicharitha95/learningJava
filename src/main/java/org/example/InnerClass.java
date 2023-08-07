package org.example;

public class InnerClass {
    public static void main(String args[]){
        Car obj=new Car();  //we cant create a obj for inner class directly
        obj.price();
        Car.Bike obj1=obj.new Bike(); //nonstatic class obj creation
        obj1.model();
        Car.Bus obj2=new Car.Bus(); //static class object creation
        obj2.Type();
    }
}
class Car{
    public void price(){
        System.out.println("Car Price");
    }
    class Bike{
        public void model(){
            System.out.println("Bike Model");
        }
    }
    static class Bus{   //we can use static for inner class
        public void Type(){
            System.out.println("Bus Type");
        }
    }
}
