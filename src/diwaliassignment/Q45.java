package diwaliassignment;

public class Q45 {

    public static void main(String[] args) {
        int num=0;
        int itt=0;
        for (int i=1;i<=5;i++){
            num++;
            itt=num;
            System.out.println("");
            for(int j=1;j<=i;j++){

                System.out.print(" "+itt+" ");
                itt--;


            }
        }
    }
}
