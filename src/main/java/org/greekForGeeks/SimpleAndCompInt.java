package org.greekForGeeks;
import java.util.Scanner;
public class SimpleAndCompInt {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Principle amount");
        int p=sc.nextInt();
        System.out.println("enter Time Taken");
        int t=sc.nextInt();
        System.out.println("Enter a Rate");
        int r= sc.nextInt();
       // float ci=p*(Math.pow(1+r/100),t));
        float si=(p*t*r)/100;
        System.out.println("the Simple interest is"+" "+si);
    }
}
