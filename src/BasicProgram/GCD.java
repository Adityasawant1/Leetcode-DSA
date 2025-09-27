package BasicProgram;

import java.util.Scanner;

public class GCD {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number = ");
        int n1=sc.nextInt();
        System.out.print("Enter the Second Number = ");
        int n2=sc.nextInt();
        System.out.println("GCD of "+n1+" and "+n2+" = "+GCD(n1,n2));
    }
    public static int GCD(int n1,int n2)
    {
        int ans=1;
        int n=Math.min(n1,n2);
        for(int i=2;i<=n;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                ans=i;
            }
        }
        return ans;
    }
}

