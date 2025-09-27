package BasicProgram;

public class PrimeNum {
    public static void main(String args[])
    {
        prime(3);
    }
    public static boolean prime(int num)
    {
        if(num==0 || num==1){
            return true;
        }
        return false;
    }
}
