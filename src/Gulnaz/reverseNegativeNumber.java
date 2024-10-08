package Gulnaz;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

   //reverseNegativeNumber by Nadira
    public static int reverseNegativeNumber(int num){
        int reverseNegativeNumber=0;
        while(num!=0){
            int digit= num%10;
            reverseNegativeNumber=reverseNegativeNumber*10+digit;
            num/=10;
        }
        return reverseNegativeNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-35));
    }

}

