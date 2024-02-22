package Assignment_Day6.FrequencyCounter;
import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args) {
        Map<String,Integer> mapList = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any Sentence to find the words frequency: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for(String word : words)
        {
            if(mapList.get(word)==null)
            {
                mapList.put(word,1);
            }
            else {
                int count = mapList.get(word);
                mapList.replace(word,count+1);
            }
        }
        System.out.println("The Words counts are: ");
        for(Map.Entry<String,Integer> map : mapList.entrySet())
        {
            System.out.println(map.getKey()+" : "+map.getValue());
        }


    }
}
