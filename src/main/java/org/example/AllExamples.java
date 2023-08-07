package org.example;

public class AllExamples {
    public static void main(String[] args){
        int n=2,n2=4;
        //int result=n+n2;

        calculator calc = new calculator();
        int result=calc.add(4,5);

        System.out.println(result);
       //terinaryop(1);
        //char c='{';
        //c++;
        //System.out.println(c);
        //conversions(254);

    }

    public static void conversions(int a) {
        byte c=126;
        byte k=(byte) a;
        int g= c;
        float f=5.6f;
        int j=(int) f;
        System.out.println(g);
        System.out.println(k);
        System.out.println(j);
    }
    public static void terinaryop(int n){
        int result;
        result=n%2==0?10:20;
        System.out.println(result);
        //it is not applicable in all cases
    }
public static class calculator{
        public int add(int num,int num2){
            int r=num+num2;
            System.out.println(r);
            return 0;
        }
}

}
