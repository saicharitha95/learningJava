package org.example;

public class string {
    public static void main(String args[]){
        strBuffer();
        //String name="sai";
        //name=name+"hello";
        //System.out.println(name);
    }
    public static void strBuffer(){
        StringBuffer a= new StringBuffer("sai");
        System.out.println(a.append("hello"));
        System.out.println(a.insert(1,"cherry"));
        System.out.println(a.deleteCharAt(2));
    }
}
