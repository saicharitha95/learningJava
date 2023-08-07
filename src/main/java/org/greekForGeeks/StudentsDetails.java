package org.greekForGeeks;
import java.util.Scanner;
public class StudentsDetails {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name=sc.nextLine();
        System.out.println("enter the special depictor");
        String special=sc.nextLine();
       System.out.println("enter the age");
       int age=sc.nextInt();
       System.out.println("enter the roll no");
       int rollNo=sc.nextInt();
       if(special.equals("E")){
           Student engineer=new Engineer();
           engineer.StudentInfo(name,age,rollNo);
           //System.out.println("Branch:"+branch);
       }
       else if(special.equals("M")){
           Student medical=new Medical();
           medical.StudentInfo(name,age,rollNo);
           //System.out.println("Specialization:"+specialization);
       }
    }
}
abstract class Student{
    String  name;
    int age;
    int rollNo;
    String specialization;
    
    public abstract void StudentInfo(String name, int age, int rollNo);
}

class Medical extends Student{

    public void StudentInfo(String name,int age,int rollNo){
        System.out.println("Enter Specialization:");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Roll No:"+rollNo);
       System.out.println("Specialization:"+specialization);
    }
}
class Engineer extends Student{
    public void StudentInfo(String name,int age,int rollNo){
        System.out.println("Enter branch");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Roll No:"+rollNo);
      System.out.println("Specialization:"+specialization);
    }
}