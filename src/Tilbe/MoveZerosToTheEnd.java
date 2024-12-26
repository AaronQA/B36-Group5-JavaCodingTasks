package Tilbe;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/
    public static void main(String[] args) {
       int[]arr={1,0,2,0,-3,0,4,0};
       int[]arr2={1,2,3,4};
       int[]arr3={0,0,0,0,0};
       
      System.out.println(Arrays.toString(moveZerosToEnd(arr)));
      System.out.println(Arrays.toString(moveZerosToEnd(arr2)));
      System.out.println(Arrays.toString(moveZerosToEnd(arr3)));
      System.out.println(Arrays.toString(moveZerosToEnd(null)));
      
    }
    
    public static int[] moveZerosToEnd(int[]arr){
      
      if (arr == null) throw new IllegalArgumentException("Array is null!");
      
      int[] zerosEnd=new int[arr.length];
      int index=0;
      for (int each : arr) {
        if(each!=0){
          zerosEnd[index++]=each;
      }
      }
      return zerosEnd;
    }


}