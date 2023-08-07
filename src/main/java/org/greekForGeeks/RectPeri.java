package org.greekForGeeks;
import java.util.Scanner;
public class RectPeri {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int len=sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int bre=sc.nextInt();
        int perimeter=2*(len+bre);
        System.out.println("the perimeter of the recantangle is"+" "+perimeter);
    }
}
