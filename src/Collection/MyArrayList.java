package Collection;

class ArrayList<E>{
    private Object[] element;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList(){
        element = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e)
    {
        ensureCapacity();
        element[size++]=e;
    }

    public E get(int index)
    {
        checkIndex(index);
        return (E) element[index];
    }

    public E remove(int index)
    {
        checkIndex(index);
        E oldValue = (E) element[index];

        int numMoved = size - index - 1;
        if(numMoved>0)
        {
            System.arraycopy(element,index+1,element,index,numMoved);
        }
        element[--size] = null;
        return oldValue;
    }

    public int size()
    {
        return size;
    }

    public void ensureCapacity()
    {
        if(size == element.length)
        {
            System.out.println(size);
            int newCapacity = element.length*2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(element,0,newArray,0,size);
            element = newArray;
        }
    }


    public void checkIndex(int index)
    {
        if(index<0 || index>=element.length)
        {
            throw new IndexOutOfBoundsException("Index: "+index+"Size: "+size);
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");
        for(int i=0;i<size;i++)
        {
            sb.append(element[i]);
            if(i<size-1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
public class MyArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());

        list.add(3);
        list.add(5);
        list.add(90);


        System.out.println(list.remove(2));
        System.out.println(list.get(1));
        System.out.println(list);
    }


}
