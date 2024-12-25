package Tilbe;


public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
    public static void main(String[] args) {
      int[] arr = {99, 12, 23, 32, 44, 57, 6};
      int[] arr2={0,-4,1000,4,12};
      System.out.println(findMin(arr));
      System.out.println(findMin(arr2));
      
    }
    
    public static int findMin(int[] arr) {
      int min=Integer.MAX_VALUE;
      for (int each : arr) {
        if(each<min){
          min=each;
        }
      }
      
      return min;
    }




}