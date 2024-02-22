package FileIO.FileReadingOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class FileReadingOperation {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("/Users/tm10/IdeaProjects/test/src/main/java/FileIO/FileReadingOperation/FileReadingOperation.java");

            StringBuffer buffer =  new StringBuffer();
            int ch;
            while((ch = fis.read())!=-1)
            {
                buffer.append((char) ch);
            }

            System.out.println("\nThe file data: \n"+buffer);
        } catch (IOException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }

    }
}
