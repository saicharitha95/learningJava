package org.example;

public class array {
    public static void main(String args[]){
        //multiDimArray();
        dynamicArray(7);
        int arr[]={5,9,12,8};
        //for updating the value of
        arr[1]=5;
        System.out.println(arr[3]);
    }
    public static void dynamicArray(int num){
        int arr1[]=new int[num];
        arr1[0]=1;
        arr1[1]=3;
        arr1[2]=4;
        arr1[3]=6;
        arr1[4]=8;
        for(int i=0;i<arr1.length;i++) {
            System.out.println(arr1[i]);
        }
    }
    public static void multiDimArray(){
        int arr2[][]= new int[4][5];
        arr2[3][4]=6;
  //random() is used to assign the random values,it is less than 1 and double data type.
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                arr2[i][j]=(int)(Math.random()*100);
                System.out.print(arr2[i][j] +" ");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
