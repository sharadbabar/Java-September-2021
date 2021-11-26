package string;

public class DuplicateValueString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abbced");

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    str.deleteCharAt(j);
                }


            }

        }
        System.out.println(str);


        //a b b c d e
        //0 1 2 3 4 5


    }
}
