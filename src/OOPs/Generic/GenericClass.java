package OOPs.Generic;

class Box<T,T1>{
    private T id;
    private T1 name;

    public T getValue()
    {
        return this.id;
    }
    public T1 getName(){
        return this.name;
    }
    public void setValue(T id ,T1 name)
    {
       this.id = id;
       this.name = name;
    }


}

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer,String> bx= new Box<>();

        bx.setValue(1," Aditya");

        System.out.print(bx.getValue());
        System.out.println(bx.getName());
    }
}
