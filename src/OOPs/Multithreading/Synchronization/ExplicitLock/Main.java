package OOPs.Multithreading.Synchronization.ExplicitLock;

public class Main {
    public static void main(String[] args) {

        Banking kotak= new Banking();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                kotak.withdrow(50);
            }
        };
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);
        Thread t3=new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
