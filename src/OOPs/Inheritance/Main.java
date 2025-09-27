package OOPs.Inheritance;


class A {
    String name="Aditya";

    public String getName()
    {
        return this.name;
    }

}


public class Main {
    public static void main(String args[])
    {
        A a=new A();
        System.out.println(a.getName());

    }

}
