package org.greekForGeeks;
import java.util.Scanner;
public class SwapTwoNums {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("The First Input Number is"+" ");
        int num1=sc.nextInt();
        System.out.println("The second Input Number is"+" ");
        int num2=sc.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping number 1 is"+" "+num1);
        System.out.println("After Swapping number 2 is"+" "+num2);


    }
}
