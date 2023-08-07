package org.greekForGeeks;

import java.util.Scanner;

public class LargeAmongThree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a First input Number"+" ");
        int a=sc.nextInt();
        System.out.println("Enter a Second input Number"+" ");
        int b=sc.nextInt();
        System.out.println("Enter a Third input Number"+" ");
        int c= sc.nextInt();
        if(a>b&&a>c){
            System.out.println("the largest number is" +" "+a);
        }
        else if(b>a&&b>c){
            System.out.println("the largest number is" +" "+b);
        }
        else{
            System.out.println("the largest number is" +" "+c);
        }
    }
}
