package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter= null;
        BufferedWriter bufferedWriter=null;
        try {
           fileWriter=new FileWriter("C:\\Users\\admin\\IdeaProjects\\Sept-Batch\\src\\filehandling\\bufferWriter.txt");
             bufferedWriter=new BufferedWriter(fileWriter);
            String str="I am in Pune";
            bufferedWriter.write(str);
            System.out.println("File Write Successful");

        } catch (IOException e) {
            e.printStackTrace();

        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}
