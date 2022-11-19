package org.example;

import org.omg.CORBA.WStringSeqHelper;

public class EvenNumbers {
    public static void main (String args[]){
        int n=20;
        isEven(n);

        String s="sai";

    }
    public static void isEven(int n){
        int i;
        for(i=0;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }

        }
    }

}


