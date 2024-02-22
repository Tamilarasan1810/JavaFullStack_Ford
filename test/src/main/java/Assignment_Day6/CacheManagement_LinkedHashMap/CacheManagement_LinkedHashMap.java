package Assignment_Day6.CacheManagement_LinkedHashMap;

import java.util.LinkedHashMap;

public class CacheManagement_LinkedHashMap<K,V> {
    private int cacheSize;
    private LinkedHashMap<K,V> cache ;

    public  CacheManagement_LinkedHashMap(int size)
    {
        this.cacheSize = size;
        this.cache = new LinkedHashMap<K,V>(size);
    }

    public void addElement(K key,V value)
    {
        if(this.cache.containsKey(key))
        {
            this.cache.remove(key);
            this.cache.put(key,value);
            return;
        }
        if(this.cache.size()>=this.cacheSize)
        {
            K first = this.cache.keySet().iterator().next();
            this.cache.remove(first);
        }
        this.cache.put(key,value);
    }

    public V getElement(K key)
    {
        if(!this.cache.containsKey(key))
        {
            return null;
        }
        V value = this.cache.get(key);
        this.cache.put(key,value);
        return value;
    }


    public static void main(String[] args) {
        CacheManagement_LinkedHashMap obj = new CacheManagement_LinkedHashMap(3);
        obj.addElement(1,"one");
        obj.addElement(2,"two");
        obj.addElement(3,"three");
        System.out.println(obj.cache.entrySet());
        obj.addElement(4,"four");
        System.out.println(obj.cache.entrySet());
    }
}
