package OOPs.Keywords;

public class Final_Use {
    static class final_demo{
        static final int a=10;

        private void method()
        {
            System.out.println("this is static final method");
        }
    }
     static final class Final extends final_demo {
     }
    public static void main(String[] args)
    {
        System.out.println(final_demo.a);
    }
}
