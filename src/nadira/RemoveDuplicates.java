package nadira;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/


    public static void main(String[] args) {

        removeDuplicates("AAABBBCCC");


    }

    public static void removeDuplicates(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (!result.contains("" + str.charAt(i))) {
                result+= ""+ str.charAt(i);

            }


        }
        System.out.println(result);
    }

}