package org.example;
 class student{
     int rollnum;
     String name;
     int marks;


}
public class arrayobj {
    public static void main(String args[]){


        student s1=new student();
        s1.name="sai";
        s1.rollnum=1;
        s1.marks=70;
        student s2=new student();
        s2.name="cherry";
        s2.rollnum=1;
        s2.marks=75;
        student s3=new student();
        s3.name="charitha";
        s3.rollnum=1;
        s3.marks=79;
        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name +" :"+students[i].marks);
        }


    }

}
