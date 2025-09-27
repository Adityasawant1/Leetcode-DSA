package OOPs.Encapsulation;

public class MainClass {
    public static void main(String args[])
    {
        Bank b = new Bank("Aditya",256239,5000);

        b.checkBalance();

        b.withDraw(4000);
        b.deposit(3000);

        b.checkBalance();
    }

}
