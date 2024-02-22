package CollectionsFrameWork.HashMaps.MapDemo;
import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> countryMap = new HashMap<>();
        countryMap.put(91,"India");
        countryMap.put(1,"USA");
        countryMap.put(23,"Srilanka");
        countryMap.put(45,"Nepal");
        countryMap.put(5,"China");

        System.out.println(countryMap);

        countryMap.put(5,"Australia");
        System.out.println(countryMap);

        if(countryMap.containsKey(91))
        {
            System.out.println("Country with code 91 present in map");
        }
        else
        {
            System.out.println("Country with code 91 not present in map");
        }

        if(countryMap.containsValue("India"))
        {
            System.out.println("India is present");
        }
        else {
            System.out.println("India not present");
        }

        Set<Map.Entry<Integer,String>> entries = countryMap.entrySet();// it will give the entry

        for (Map.Entry<Integer,String> entry: entries)
        {
            System.out.println(entry.getKey()+" -----> "+entry.getValue());
        }

        Set<Integer> keys = countryMap.keySet();

        System.out.println("Keys are: "+keys);

        Collection<String> values = countryMap.values();
        System.out.println("values are: "+values);

        // delete entry from map

        System.out.println("Removed country form map is: "+countryMap.remove(5));
        System.out.println("Removed country from map is: "+countryMap.remove(45,"Nepal"));

        System.out.println(countryMap.entrySet());

        countryMap.clear();
        System.out.println(countryMap);
    }
}
