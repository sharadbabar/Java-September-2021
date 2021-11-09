package filehandling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\admin\\IdeaProjects\\Sept-Batch\\src\\filehandling.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "Welcome";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("File write successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            int i=fileInputStream.read();

            while(i>0){
                System.out.print((char)i);
                i=fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
