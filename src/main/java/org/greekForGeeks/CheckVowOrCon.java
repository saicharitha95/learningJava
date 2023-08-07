package org.greekForGeeks;
import java.util.Scanner;
public class CheckVowOrCon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String To Check it is vowel or consonant");
        char str1 = 'a';
        //char str1 = 'a';
        if(str1=='a'||str1=='e'||str1=='i'||str1=='o'||str1=='u'){
            System.out.println("Given is Vowel");
        }
        else{
            System.out.println(" given is a Consonant");
        }

    }
}