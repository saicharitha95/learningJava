package org.example;

public class StaVariable {
    public static void main(String args[]) {
        mobiles obj1 = new mobiles();
        obj1.model = "poco x2";
        obj1.cost = 15000;
        mobiles.type = "SmartPhone";//we have to call the static variable with a class name
        mobiles obj2 = new mobiles();
        obj2.model = "realme";
        obj2.cost = 25000;
        mobiles.type = "SmartPhone";
        obj1.type="phone";
        obj1.display();
        obj2.display();


    }
}
        class mobiles{
            String model;
            int cost;
            static String type;
            public void display(){

                System.out.println(model+":"+cost+":"+type);
            }
        }

