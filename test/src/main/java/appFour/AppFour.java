package appFour;
import java.util.*;
// to find array prefix sum
public class AppFour {
    private static int[] preSum(int[] arr)
    {
        int sum=0;
        int preArr[] = new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            preArr[i]=sum;
        }
        return preArr;
    }
    public static void main(String[] args) {
        int numArr[] = new int[5];

        numArr[0]=10;
        numArr[1]=43;
        numArr[2]=32;
        numArr[3]=43;
        numArr[4]=53;
        System.out.println("Prefix array: "+Arrays.toString(preSum(numArr)));
    }
}
