package Gulnaz;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

   //reverseNegativeNumber by Tilbe
//    public static int reverseNegativeNumber(int num){
//        int reverseNegativeNumber=0;
//        if(num>0) throw new IllegalArgumentException("Number must be less than 0");
//        while(num!=0){
//            int digit= num%10; //5
//            reverseNegativeNumber=reverseNegativeNumber*10 + digit;
//            num/=10;
//
//        }
//        return reverseNegativeNumber;
//    }
    //reverseNegativeNumber by Aiturgan
    public static int reverseNegativeNumber(int num){
        int reverseNegativeNumber=0;
        while(num!=0){ //50
            int digit= num%10; //digit=0
            reverseNegativeNumber=reverseNegativeNumber*10 + digit;//""+0+0
            num/=10;
        }
        return reverseNegativeNumber;
    }






    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-50));
    }
/*
The selected code is a method named `reversedNegativeNumber` that takes an integer as input and returns the reversed digits of the negative number as an integer.

Here's a step-by-step explanation of the code:

1. The method `reversedNegativeNumber` takes an integer `num` as a parameter.
2. It initializes a variable `reversedNegativeNumber` to 0, which will store the reversed digits.
3. The method enters a while loop that continues until `num` becomes 0.
4. Inside the loop, it calculates the last digit of `num` by taking the remainder of `num` divided by 10 (`num % 10`).
5. It then updates `reversedNegativeNumber` by multiplying it by 10 and adding the last digit (`reversedNegativeNumber * 10 + digit`).
6. Finally, it updates `num` by dividing it by 10 (`num /= 10`) to remove the last digit from `num`.
7. Once the loop finishes, the method returns `reversedNegativeNumber`, which contains the reversed digits of the negative number.

This method can be used to reverse the digits of any negative integer.
 */
}

