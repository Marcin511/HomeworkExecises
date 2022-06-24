package oop;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaIO {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("Directory/input.txt");
            FileOutputStream out = new FileOutputStream("Directory/output.txt");
            System.out.println("udało się");
            int c;
            while ((c = in.read())!=-1){
                System.out.print((char)c);
                out.write(c);
            }
            in.close();
            out.close();
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }
}
