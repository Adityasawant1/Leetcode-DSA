package OOPs.Multithreading.Synchronization.ExplicitLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banking extends Thread{
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public  void withdrow(int amount) {

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {

                try {
                    System.out.println(Thread.currentThread().getName() + " Processing withdrow");
                    if (balance >= amount) {
                        try {
                            Thread.sleep(1000);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        balance -= amount;
                        System.out.println("Withdrow Successfullty : " + amount + " current Balance : " + balance);
                    } else {
                        System.out.println(Thread.currentThread().getName() + " Insufficient Balance ");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName()+ " Could not acquire the lock, will try later");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



}
