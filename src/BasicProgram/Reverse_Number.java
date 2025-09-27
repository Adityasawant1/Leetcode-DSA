package BasicProgram;

public class Reverse_Number {
    public static void main(String args[])
    {
        int n=696,ld,rev=0;
        int original=n;
        while(n>0)
        {
            ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }

      System.out.println("Reverse Number : "+rev);

        if(rev==original)
        {
            System.out.println("Number is Palindrome");
        }else
        {
            System.out.println("Number is not Palindrome");
        }
    }

}
