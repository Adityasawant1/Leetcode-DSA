package OOPs.Multithreading.Synchronization.Normal;

public class Mythread extends Thread{
    public Counter counter;

    Mythread(Counter counter)
    {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++)
        {
            counter.increment();
        }
    }

}
