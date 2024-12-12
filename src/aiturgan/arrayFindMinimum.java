package aiturgan;
public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int[] arr1 = {4,3,1212,32,-12,32,0};
        int[] arr2 = {1,1,1,1,1,1,1,1};
        System.out.println(findMin(arr));
        System.out.println(findMin(arr1));
        System.out.println(findMin(arr2));

    }

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}