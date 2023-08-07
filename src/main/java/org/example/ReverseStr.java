package org.example;


class ReverseStr {
    public static void main (String[] args) {

        String str= "Geeks",srg="word", nstr="";
        String a=reverseString(str);
        //addString(str,srg);
        //boolean result=palindromeString(str);
        //System.out.println(result);
        int result=addnum(4,5);
        boolean end=evenOrOdd(result);

    }

    public static String reverseString(String str){
        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word
        String nstr = null;
        char ch = 0;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch + nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
        return nstr;

    }
    public static String addString(String str,String srg){
        String astr=null;
        astr=str+srg;
        System.out.println("addstring :"+astr);
        return astr;
    }
    public static boolean palindromeString(String str){
        String reversedstr=reverseString(str);
        boolean result;
        if(reversedstr.equals(str)){
           System.out.println("palindrome:");
            result=true;
        }
        else{
            System.out.println(" not a palindrome:");
            result=false;

        }
        return result;
    }
    public static int addnum(int a,int b){
        int add=a+b;
        System.out.println(add);
       int result=add+10;
       System.out.println(result);
       return result;
    }
    public static boolean evenOrOdd(int result){
        boolean end;
        if(result%2==0){
            System.out.println("even");
            end=true;
        }
        else{
            System.out.println("odd");
            end=false;
        }
        return end;
    }
    public static boolean addreverse(String str,String srg){
        String add=addString(str,srg);
        String result=reverseString(add);
        boolean a= palindromeString(result);
         return a;

    }




}
