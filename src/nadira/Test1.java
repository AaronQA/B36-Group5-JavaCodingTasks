package nadira;

public class Test1 {
    public static void main(String[] args) {


        String str= "Nadira ";

reverse(str);

    }

    public static void  reverse (String str){

        String reversed ="";
        str= str.trim();
        for (int i = str.length()-1; i >=0; i--) {

            reversed+= str.charAt(i);


        }
        System.out.println(reversed);

    }


}
