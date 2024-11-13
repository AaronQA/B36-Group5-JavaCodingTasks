package barno;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {

        System.out.println("frequencyOfCharacters(\"AAABBCDD\") = " + frequencyOfCharacters("AAABBCDD"));


    }
    public static  String frequencyOfCharacters(String word) {

        String result = "";

        for (int i = 0; i < word.length(); i++) {

            if (result.contains("" + word.charAt(i))) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)== word.charAt(j)) {
                    count++;
                }
            }

            result += word.charAt(i)+ "" + count;
        }

        return result;
    }

    /*

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
        System.out.println(frequencyOfChars("aaaaaBBccDDDDD"));
        System.out.println(frequencyOfChars("a    b    cccc  d"));
        System.out.println(frequencyOfChars("1222233$$@@@@!!!"));
        System.out.println(frequencyOfChars("  "));
        System.out.println(frequencyOfChars(null));

    }

    public static String frequencyOfChars(String str){
        String result="";
        if ( str==null || str.isBlank()){
            throw new IllegalArgumentException("String can not be null, empty or blank!");
        }
        for(int i=0; i<str.length(); i++){
            int count=0;
            char ch=str.charAt(i);
            for (int j=0; j<str.length(); j++){
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if(ch==' ' || result.contains(ch+"")){
                continue;
            }
            result+=ch+""+count;
        }
        return result;
    }

}

     */



}







