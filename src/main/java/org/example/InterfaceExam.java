package org.example;
//class-class and interface-interface->extends
//class-interface->implements
public class InterfaceExam {
    public static void main(String args[]){
        Developer sai=new Developer();
       // Computer lap=new Laptop();
        Computer desk=new Desktop();
       sai.code(desk);
       System.out.println(Computer.age);
    }
}
interface Computer{  //cant create obj for interface
    int age=20;
    String area="ATP";  //variables should be static or final
    void code();
}

/*
class Laptop implements Computer,System{
    public void code(){

        System.out.println("run,compile");
    }
    public void excute(){

        System.out.println("in excute");
    }
}
*/
class Desktop implements Computer{
    public void code(){
        System.out.println("run,excute,fastre");
    }
}
class Developer{
    public void code(Computer lap){
        lap.code();
    }
}
