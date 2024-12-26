package aiturgan;
public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int[] arr1 = {4,3,1212,32,-12,32,0};
        int[] arr2 = {1,1,1,1,1,1,1,1};
        System.out.println(findMin(arr));
        System.out.println(findMin(null));
        System.out.println(findMin(arr1));
        System.out.println(findMin());
        System.out.println(findMin(arr2));
        System.out.println(findMin(1,0,2,-1,-332,32,223));

    }

    public static int findMin(int... arr) { //var args
        try {
            int min = arr[0];
            for (int each : arr) {
                if (each < min) {
                    min = each;
                }
            }
            return min;
        } catch (Exception e) {
            System.out.print("Array is empty or null. Try again! -> ");
            return Integer.MAX_VALUE;
        }
    }
}