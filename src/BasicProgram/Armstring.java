package BasicProgram;

public class Armstring {
    public static void main(String args[])
    {
        Armstring(153);
    }
    public static void Armstring(int n)
    {
        int original=n;
        int digit;
        int sum=0;
        while(n>0)
        {
            digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }
        if(sum==original)
        {
            System.out.println("Number is Armstrong");
        }else
        {
            System.out.print("Number is not armstrong");
        }
    }
}
