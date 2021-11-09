package practice;

public class CountingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3,2,2};
        int count1 = 0;
        int count2=0;
        int count3=0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1 = count1 + 1;

            }
            else if (arr[i]==2){
                count2=count2+1;
            }
            else if(arr[i]==3){
              count3=count3+1;
            }
        }
        System.out.println("The number of 1's in the array are -->" + count1);
        System.out.println("The number of 2's in the array are -->" + count2);
        System.out.println("The number of 3's in the array are -->" + count3);
    }

}
