package org.example;

public class DynamicMethod {
    public static void main(String args[]){
      All obj=new All();
      obj.show();
      obj=new B();
      obj.show();
      B obj1=new Call();
      obj1.show();
    }
}
class All{
   public void show(){
       System.out.println("in All");
   }
}
class B extends All{
    public void show(){
        System.out.println("in B");
    }
}
class Call extends B{
    public void show(){
        System.out.println("in Call");
    }
}