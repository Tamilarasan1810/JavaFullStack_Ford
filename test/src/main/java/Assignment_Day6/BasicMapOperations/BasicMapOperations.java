package Assignment_Day6.BasicMapOperations;

import java.util.*;

public class BasicMapOperations {
    public void insertMap(Map<String, Object> mapList,String key,Object value)
    {
        mapList.put(key,value);
        System.out.println("key-value pair inserted successfully");
    }
    public static void main(String[] args) {
        Map<String,Object> mapList = new HashMap<String,Object>();
        BasicMapOperations obj = new BasicMapOperations();
        obj.insertMap(mapList,"name","John");
        obj.insertMap(mapList,"age",35);

        System.out.println(mapList.get("name"));
        System.out.println(mapList.get("age"));

    }
}
