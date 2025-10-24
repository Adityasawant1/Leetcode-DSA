package Collection.Map.HashMap;

import java.util.HashMap;

public class Coll_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Aditya",1);
        map.put("Niraj",2);
        map.put("Rohit",3);
        map.put("Yash",4);
        System.out.println(map.remove("Yash"));
        System.out.println( map.containsKey("Yash"));
        System.out.println(map);

    }
}
