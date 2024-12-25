package Questions;


import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/

    public static void main(String[] args) {

        System.out.println(Arrays.toString(moveZeros(1, 0, 2, 0, 3, 0, 4, 0)));

    }

    public static int[] moveZeros(int... arr) {

        int[] result = new int[arr.length];
        int index = 0;

        for (int each : arr){
            if(each != 0){
                result[index++] = each;
            }
        }

        return result;

    }

}