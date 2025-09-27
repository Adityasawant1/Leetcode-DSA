package BasicProgram;

public class All_Divisiors {
    public static void main(String args[])
    {
        divisor(36);
    }

    public static void divisor(int n)
    {
        System.out.print("Divisior of "+n+" "+" = ");

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i + ",");
            }
        }
    }

}
