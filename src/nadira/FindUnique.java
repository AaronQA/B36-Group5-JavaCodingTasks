package nadira;

public class FindUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {


        findUnique("AAABBBCCCDEF");
    }

public  static  void findUnique(String str) {
   ;
    String unique = "";

    if( str == null ||str.isEmpty() || str.isBlank() ){

    throw  new IllegalArgumentException("Input can not be null, empty, blank ");
    }
    for(int i = 0; i < str.length(); i++){
//        char c = str.charAt(i);
        if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
            unique += str.charAt(i);
        }
    }
    System.out.println(unique);


}


}