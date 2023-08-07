package org.example;

public class OverridingExp {
    public static void main(String args[]){
        AdvCalc obj=new AdvCalc();
        int r=obj.add(4,5);
        System.out.println(r);
    }
}

class AdvCalc extends Calc{
//    public int add(int n1,int n2){
//       return n1+n2+1;
 }
//
//}
