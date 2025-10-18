package Collection.List.Vector;

import java.util.Vector;

public class Demo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println(v.capacity());
        v.add(1);
        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(5);
        System.out.println(v);
        System.out.println(v.size());
        v.set(v.size()-1,1);
        v.remove(Integer.valueOf(5));
        System.out.println(v);
    }
}
