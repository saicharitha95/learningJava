package org.greekForGeeks;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number"+" ");
        int num=sc.nextInt();
        CheckEveOrOdd(num);

    }
    public static void CheckEveOrOdd(int num1){
        if(num1%2==0)
            System.out.println("The given number is even"+" "+num1);
        else{
            System.out.println("The given number is odd"+" "+num1);
        }
    }
}
