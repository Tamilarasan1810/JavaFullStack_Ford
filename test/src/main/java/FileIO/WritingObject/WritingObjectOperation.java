package FileIO.WritingObject;

import java.util.*;
import java.io.*;
public class WritingObjectOperation {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        int empId = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        sc.next();
        String empName = sc.nextLine();
        BufferedOutputStream bufferOutput = null;
        FileOutputStream fileOutput = null;
        String finalValue = "Welcome "+empName + " ,your Employee Id is "+empId;
        try {
            fileOutput = new FileOutputStream("/Users/tm10/IdeaProjects/test/src/main/java/FileIO/fordInfo.txt");
            bufferOutput = new BufferedOutputStream(fileOutput);
            bufferOutput.write(finalValue.getBytes());
            System.out.println("Data is written into the file");
        }catch (IOException e)
        {
            e.printStackTrace();
        }finally {
            try {
                bufferOutput.flush();
                bufferOutput.close();
                fileOutput.close();
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
