package Collection.List.LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size=0;

    public void addFirst(int data)
    {
        //step 1 - create New Node
        Node newNode = new Node(data);
        size++;
        if(Head == null)
        {
            Head = Tail = newNode;
            return;
        }
        // step 2 - newNode next = head
        newNode.next = Head;
        // step 3 - head = newNode;
        Head = newNode;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(Tail == null)
        {
            Head = Tail = newNode;
            return;
        }
        Tail.next= newNode;
        Tail = newNode;
    }

    public void print()
    {
        if(Head==null)
        {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = Head;
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index,int data){
        Node newNode = new Node(data);
        size++;
        Node temp = Head;
        int i = 0;

        while(i<index-1){
            temp = temp.next;
            i++;
        }
        // 1 -> 2(temp)->3(temp.next)->null
        // 1 -> 2(temp)  No connection 4(newNode.next)->3(temp.next)->null
        newNode.next = temp.next;
        // 1 -> 2(temp) -> 4(temp.next)->3->null
        temp.next = newNode;
    }
    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("LL is empty ");
            return Integer.MIN_VALUE;
        }else if(size == 1)
        {
            int val = Head.data;
            Head = Tail = null;
            size=0;
            return val;
        }
        int val = Head.data;
        Head = Head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("LL is empty ");
            return  Integer.MIN_VALUE;
        }else if(size == 1)
        {
            int val = Head.data;
            Head = Tail = null;
            size=0;
            return val;
        }
        Node prev =Head;
        for(int i = 0 ; i<size-2 ; i++)
        {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next= null;
        Tail = prev;
        size--;
        return val;
    }
    public int IterativeSearch(int key)
    {
        Node temp = Head;
        int i=0;
        while(temp != null)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int Helper(Node Head,int key)
    {
        if(Head==null)
        {
            return -1;
        }else if(Head.data == key)
        {
            return 0;
        }
        int idx = Helper(Head.next,key);
        if(idx==-1)
        {
            return idx;
        }
        return idx+1;
    }
    public int RecursiveSearch(int key)
    {
        return Helper(Head,key);
    }

    public void reverse()
    {
        Node prev = null;
        Node current = Head;
        Node next;

        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
    }
    public void printReverse()
    {
        if(Tail == null)
        {
            System.out.print("LL is empty");
            return;
        }
        Node temp = Tail;
        while(temp!=null)
        {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.print(" null");

    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();
        ll.reverse();
        ll.printReverse();
//        System.out.println("Size of LL : "+ ll.size);
//        ll.removeFirst();
//        ll.removeLast();
//
//        ll.print();
//        System.out.println("Recursive Search : "+ll.RecursiveSearch(4));
//        System.out.println("Search Value 4 Index : "+ll.IterativeSearch(3));
//
//        System.out.println("Size of LL : "+ ll.size);
    }
}
