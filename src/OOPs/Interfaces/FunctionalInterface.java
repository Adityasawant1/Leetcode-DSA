package OOPs.Interfaces;

public class FunctionalInterface {
    public static void main(String[] args) {
        Runnable obj = () -> System.out.println("Hello");

        Thread t1 = new Thread(obj);
        t1.start();
    }
}
