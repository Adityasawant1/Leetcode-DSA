package OOPs.Encapsulation;

public class Bank {

    private String name;
    private final int accNO;
    private double balance;

    public Bank(String name, int accNO, double balance)
    {
       this.name=name;
       this.accNO=accNO;
       this.balance=balance;
    }





    public void setBalance(double balance) {
        if(balance>0) {
            this.balance = balance;
        }else {
            System.out.println("Invalid balance");
        }
    }

    public void deposit(int amount)
    {
        if(amount>0)
        {
            balance+=amount;
        }else {
            System.out.println("Invalid amount");
        }
    }
    public void checkBalance()
    {
        System.out.println("Current Balance :" + balance);
    }

    public void withDraw(int amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("Amount withdrawed : "+amount);
        }else {
            System.out.println("Invalid Amount");
        }

    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accNO=" + accNO +
                ", balance=" + balance +
                '}';
    }
}
