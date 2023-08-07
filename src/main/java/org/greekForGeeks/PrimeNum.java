package org.greekForGeeks;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to print prime numbers :");
        int n=sc.nextInt();
        int count;
        System.out.println("the prime numbers are :");
        for(int i=1;i<=n;i++) {
            count=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }

            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
