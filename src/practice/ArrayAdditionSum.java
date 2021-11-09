package practice;

public class ArrayAdditionSum {


    public static void main(String[] args) {
        int[] arr={1,2,3,1,0,0,7};
        boolean flag=false;

        for(int i=0;i< arr.length-2;i++){

            if((arr[i]+arr[i+1]+arr[i+2]==7)){
                flag=true;
                System.out.println("True");
                break;
            }

        }
        if(flag==false){
            System.out.println("False");
        }


    }
}
