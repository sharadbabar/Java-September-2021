package filehandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\admin\\IdeaProjects\\Sept-Batch\\src\\filehandling\\bufferoutput.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "Pune";
            byte[] arr = str.getBytes();
            bufferedOutputStream.write(arr);
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
