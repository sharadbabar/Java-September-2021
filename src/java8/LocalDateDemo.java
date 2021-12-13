package java8;

import java.util.Date;

public class LocalDateDemo {
    public static void main(String[] args) {
        Date date= new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());
        Date d1=new Date(1639137241898L);

    }
}

/*
Local date has private constructor and therefore object cannot be made
other all methods are static.
*/
