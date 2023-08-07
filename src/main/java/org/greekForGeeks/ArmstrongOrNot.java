package org.greekForGeeks;

import java.util.Scanner;
public class ArmstrongOrNot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check armstrong or not");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(num!=0){
            int rem = num % 10;
            sum=rem*rem*rem+sum;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("The given number is Armstrong"+" "+sum);
        }
        else{
            System.out.println("The given number is not a Armstrong"+" "+sum);
        }
    }
}
