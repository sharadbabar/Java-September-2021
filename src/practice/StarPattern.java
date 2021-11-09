package practice;

public class StarPattern {
    public static void main(String[] args) {
        for (int i=4;i>=1;i--){
            System.out.println("");
            for (int j=1; j<=i;j++){
                System.out.print(" * ");
            }
        }
    }
}
