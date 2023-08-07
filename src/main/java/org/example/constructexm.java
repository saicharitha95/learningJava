package org.example;

public class constructexm {
    public static void main(String args[]){
        animal obj=new animal();
        animal obj1=new animal(8,"tiger");
        System.out.println(obj.getAge()+":"+obj.getType());
        System.out.println(obj1.getAge()+":"+obj1.getType());
        obj.setAge(7);
        obj.setType("lion");
        System.out.println(obj.getAge()+":"+obj.getType());
    }
}
class animal{
    private int age;
    private String type;
    public animal(){       //default constructor
        age=12;
        type="dog";
        System.out.println("in constructor");
    }
    public animal(int b,String n){           //parametrized constructor
        age=b;
        type=n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public String getType(){
        return type;
    }
    public void setType(String t){
        type=t;
    }


}
