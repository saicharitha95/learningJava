package org.example;

public class encapexam {
    public static void main(String args[]) {
        human obj = new human();
        System.out.println(obj.getAge() + ":" + obj.getName());
        obj.setAge(20);
        obj.setName("sai");
        //System.out.println(obj.getAge() + ":" + obj.getName());
    }
}
class human{
        private int age;
        private String name;
        public int getAge(){

            return age;
        }
        public void setAge(int age){

            this.age=age;//this keyword refers to current object
        }
        public String getName() {

            return name;
        }
        public void setName(String name){

            this.name=name;
        }
}

