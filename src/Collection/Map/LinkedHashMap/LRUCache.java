package Collection.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V>{
    private final int capacity;

    LRUCache(int capacity)
    {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> cache = new LRUCache<>(3);

        cache.put("Aditya",1);
        cache.put("Pradip",3);
        cache.put("Karan",1);
        cache.put("Rohit",5);

    }
}
