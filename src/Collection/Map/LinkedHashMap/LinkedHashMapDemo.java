package Collection.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1,"Aditya");
        map.put(2,"Rohit");
        map.put(3,"Bob");
        map.put(4,"Alice");

        System.out.println(map.get(4));
        map.getOrDefault(2,"Aditya");
        System.out.println(map);
    }
}
