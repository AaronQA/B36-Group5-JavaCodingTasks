package Gulnaz;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static int reversedNegativeNumber(int num){
        int reversedNegativeNumber=0;
        while(num !=0){ //50; 5
            int digit= num%10;   //50%10=0; 5%10=5
            reversedNegativeNumber=reversedNegativeNumber*10+digit;//0*10+0; 0+5
            num/=10; //50/10=5; 5/10=0
        }
        return reversedNegativeNumber;
    }


}

