package OOPs.Keywords;


public class Static_Use{
    public static class Static_demo{
        static int count=0;
        public int a;
        Static_demo()
        {
            count++;
            a=10;
        }
        static {
            System.out.println("This is static Block Which are going to execute at first");

        }
    }
    public static void main(String[] args){
        System.out.println(Static_demo.count);
    }

}
