package OOPs.Multithreading;

class Pen{
    public synchronized void writeWithPenAndPaper(Paper pen){
        System.out.println(Thread.currentThread().getName() + " is using pen "+this+" and trying to get Paper");

    }
    public synchronized void finishWriting()
    {
        System.out.println(Thread.currentThread().getName() + " Finished using pen "+this);
    }


}
class Paper{
    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using Paper "+this+" and trying to get Pen");

    }
    public synchronized void finishWriting()
    {
        System.out.println(Thread.currentThread().getName() + " Finished using Paper "+this);
    }
}

class Task1 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run()
    {
        pen.writeWithPenAndPaper(paper);
    }

}

class Task2 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run()
    {
        synchronized (pen)
        {
            paper.writeWithPaperAndPen(pen);
        }
    }
}
public class DeadlockExample {

    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen,paper),"Thread-1");
        Thread t2 = new Thread(new Task2(pen,paper),"Thread-2");

        t1.start();
        t2.start();
    }

}
