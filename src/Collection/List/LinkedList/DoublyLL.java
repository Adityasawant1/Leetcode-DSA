package Collection.List.LinkedList;

public class DoublyLL {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head = tail= newNode;
            return;
        }
        newNode.next=head;
        head.prev= newNode;
        head =newNode;

    }
    public int removeFirst()
    {
        if(size ==0)
        {
            System.out.println("Doubly ll is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1)
        {
            int val =head.data;
            head=tail=null;
            return val;
        }
        //This is normal implementation and where gc clean memory as the first node is not stored anywhere
        int val =head.data;
        head = head.next;
        head.prev = null;
        return val;

/*
  code for clear to garbage Collector
        Node oldHead = head;
        head = head.next;
        if (head != null) head.prev = null;
        oldHead.next = null; // optional — breaks the link explicitly
        size--;
        return oldHead.data;
*/
    }

    public void reverse()
    {
        Node prev = null;
        Node current = head;
        Node next;
        while(current!=null)
        {
            next = current.next;
            current.next= prev;
            current.prev=next;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void print()
    {
        Node temp=head;
        System.out.print("null"+" <=> ");
        while(temp!=null)
        {
            System.out.print(temp.data+" <=> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.print();


        dll.reverse();
        dll.print();
    }
}
