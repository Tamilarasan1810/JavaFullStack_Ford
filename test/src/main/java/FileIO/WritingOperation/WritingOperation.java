package FileIO.WritingOperation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingOperation {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try
        {
            fos = new FileOutputStream("/Users/tm10/IdeaProjects/test/src/main/java/FileIO/fordInfo.txt");

            System.out.println("Enter some text for writing to file: ");
            String text = new Scanner(System.in).nextLine();
            fos.write(text.getBytes());
            System.out.println("Text written to the file");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally{
            try
            {
                fos.close();
            }
            catch (IOException e)
            {
                System.out.println("Exception: "+e.getMessage());
                e.printStackTrace();
            }

        }
    }
}
