package accessmod.exp;

public class example {
    public static void main(String args[]){
        int date=9;
        System.out.println(date);
        B obj1=new B();

        System.out.println(obj1.marks);
    }
    public static class B{
        private int marks=20;
    }

}

