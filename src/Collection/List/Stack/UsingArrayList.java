package Collection.List.Stack;

import java.util.ArrayList;

public class UsingArrayList {
     static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty()
        {
            return list.size()==0;
        }
        public void push(int data)
        {
            list.add(data);
        }
        public int pop(){
            if(isEmpty())
            {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek()
        {
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(0);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
