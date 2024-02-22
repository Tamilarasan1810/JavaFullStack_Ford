package CollectionsFrameWork.HashSetDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> citySet = new HashSet<>();
        ArrayList<String> list = (ArrayList<String>) Arrays.asList(new String[]{"Chennai", "Banglore", "Hydrabad", "Bombay", "Delhi"});
        citySet.add("Chennai");
        citySet.add("Banglore");
        citySet.add("Hydrabad");
        citySet.add("Bombay");
        citySet.add("Delhi");

        System.out.println(citySet);

        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
