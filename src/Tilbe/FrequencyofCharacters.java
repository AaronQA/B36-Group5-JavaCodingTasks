package Tilbe;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyofCharacters {
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

