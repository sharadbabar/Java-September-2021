package filehandling;

import java.io.*;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\admin\\IdeaProjects\\Sept-Batch\\src\\filehandling\\file.txt");

        try( FileWriter fileWriter=new FileWriter(file)) {

            String str= "I am in Pune";
            fileWriter.write(str);
            System.out.println("File Written Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
        try(FileReader fileReader=new FileReader(file)) {

            int i=fileReader.read();
            while(i>0){
                System.out.print((char)i);
                i=fileReader.read();

            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}



//file input stream
//file output stream
































































