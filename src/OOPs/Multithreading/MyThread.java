package OOPs.Multithreading;

public class MyThread extends Thread {
    @Override
    public void run() {
        for( ; ; ) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // create new thread object
        t1.start();                   // start a new thread

        // main thread also runs infinite loop
        for( ; ; ) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
                t1.toString();
            }catch(InterruptedException e)
            {
                System.out.println(e);

            }

        }
    }
}
