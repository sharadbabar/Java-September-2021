package string;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Pune");
        str.append("City");
        System.out.println(str);



        StringBuilder bld=new StringBuilder("Welcome");
        System.out.println(bld.reverse());




        String string1=new String("Mumbai");
        string1.concat("City");
        System.out.println(string1);

        for (int i=string1.length()-1;i>=0;i++){
            System.out.println(string1.charAt(i));


        }


    }
}
