package FileIO.BufferedReading;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedReading {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fis = new FileInputStream("/Users/tm10/IdeaProjects/test/src/main/java/FileIO/FileReadingOperation/FileReadingOperation.java");

            bis = new BufferedInputStream(fis, 1024);

            byte[] buffer = new byte[1024];
            int noOfBytes = 0;

            String fileContent = "";

            while ((noOfBytes = bis.read(buffer)) != -1) {
                System.out.println("noOfBytes read: " + noOfBytes);
                fileContent = new String(buffer, 0, noOfBytes);

                System.out.println("File content is: " + fileContent);
            }
        } catch (IOException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } finally {
            fis.close();
            bis.close();

        }


    }
}
