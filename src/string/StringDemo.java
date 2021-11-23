package string;

public class StringDemo {
    public static void main(String[] args) {
        char[] arr={'m','u','m','b','i'};
        String str=new String(arr);
        String str1=new String("Pune");
        String str2="Pune";
        String str3="Pune";
        String str4=new String("Pune");
        String str5=new String("Pune");


        System.out.println(str1==str2);
        System.out.println(str2.equals(str1));


    }
}


//SCP- String constant pull
//heap memory location

