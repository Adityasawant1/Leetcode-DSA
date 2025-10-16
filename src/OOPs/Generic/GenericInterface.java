package OOPs.Generic;

interface Demo<T>{
    public T Display();
}

class Box2<T> implements Demo{
    @Override
    public T Display()
    {

        System.out.println("Interface Demo");
        return null;
    }

}

public class GenericInterface {
    public static void main(String[] args) {
        Box2<Integer> b1 = new Box2<>();
        var b2 = b1.Display();
        System.out.println(b2);
    }
}
