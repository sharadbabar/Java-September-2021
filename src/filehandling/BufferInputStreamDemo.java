package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\admin\\IdeaProjects\\Sept-Batch\\src\\filehandling\\bufferoutput.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i>0){
                System.out.print((char)i);
                i=bufferedInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
