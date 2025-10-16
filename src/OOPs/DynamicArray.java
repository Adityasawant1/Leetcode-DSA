package OOPs;

public class DynamicArray {
    public static void main(String[] args) {
        int[] element = {1,3,4,5};

        System.out.println("Element Array Size : "+ element.length);
        int[] newArray =new int[10];
        System.arraycopy(element,0,newArray,0,4);
        element = newArray;
        for(int i=0;i<element.length;i++)
        {
            System.out.print(element[i] );
            if(i<element.length-1) System.out.print(",");

        }
        System.out.println();
        System.out.println("After adding values in dynamic Array :"+element.length);
    }
}
