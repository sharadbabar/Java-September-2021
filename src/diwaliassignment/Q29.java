package diwaliassignment;

public class Q29 {
    public static void main(String[] args) {
        //      Wifi=    CodeKul#987;
        int n1=0,n2=1,n3;
        int itt=10;
        System.out.print(n1+" "+n2);
        for (int i=0;i<itt;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}
