package Collection.List.Stack;

public class UsingLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;

    public boolean isEmpty()
    {
        return head ==null;
    }

    public void push(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void peek(){
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(head.data);
    }
    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }


    public static void main(String[] args) {
        UsingLinkedList stack = new UsingLinkedList();
//        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty())
        {
            stack.peek();
            stack.pop();
        }
        stack.peek();






    }
}
