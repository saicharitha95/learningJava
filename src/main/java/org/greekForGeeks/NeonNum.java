package org.greekForGeeks;
//the sum of the  digits of the given number square is equal to the given number
import java.util.Scanner;
public class NeonNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check neon or not"+" ");
        int a=sc.nextInt();
        int res=a*a;
        System.out.println("square of the number is"+" "+res);
        //int temp=res;
        int sum=0;
        while(res!=0){
            int rem=res%10;
            sum=rem+sum;
            res=res/10;
        }
        if(sum==9){
            System.out.println("It is a neon number"+" "+sum);
        }
        else{
            System.out.println("It is not a neon number"+" "+sum);
        }
    }
}
