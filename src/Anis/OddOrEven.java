package Anis;

public class OddOrEven {
    public static void main(String[] args) {
        identify(3);
        identify(4);
    }

    public static void identify(int num){
        if(num%2==0){
            System.out.println(num+" is Even");
        }else{
            System.out.println(num+" is Odd");
        }
    }
}