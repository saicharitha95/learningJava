package org.greekForGeeks;

public class LCMOfTwoNum {
    public static  void main(String args[]){
        int a=9;
        int b=3;
        int lcm = (a>b)?a:b;
        while(true){
            if(lcm%a==0&&lcm%b==0){
                System.out.println("the lcm is"+" "+lcm);
                break;
            }
            ++lcm;
        }
    }
}
