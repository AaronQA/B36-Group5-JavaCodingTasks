package nadira;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static int reverseNegativeNumber(int num) {

        int reversedNum = 0;
if ( num>0){
    throw new IllegalArgumentException("Invalid negative number");
}
        while (num!= 0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        return reversedNum;
    }


}

