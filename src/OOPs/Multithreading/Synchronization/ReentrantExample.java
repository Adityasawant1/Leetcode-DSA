package OOPs.Multithreading.Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod()
    {
        lock.lock();
        try{
            System.out.println("Outer Method");
            Inner();
        }finally {
            lock.unlock();
        }
    }
    public void Inner()
    {
        lock.lock();
        try{
            System.out.println("Inner Method");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample re=new ReentrantExample();
        re.outerMethod();
    }
}
