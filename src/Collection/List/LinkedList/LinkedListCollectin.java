package Collection.List.LinkedList;
import java.util.LinkedList;

public class LinkedListCollectin {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        ll.remove(Integer.valueOf(3));
        System.out.println(ll);
    }
}
