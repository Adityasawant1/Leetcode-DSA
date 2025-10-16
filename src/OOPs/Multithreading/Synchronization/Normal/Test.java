package OOPs.Multithreading.Synchronization.Normal;

public class Test {
    public static void main(String args[])
    {
        Counter counter = new Counter();
        Mythread t1 = new Mythread(counter);
        Mythread t2 = new Mythread(counter);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(counter.getCount());
    }

}
