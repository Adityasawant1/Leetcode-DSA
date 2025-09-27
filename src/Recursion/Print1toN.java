package Recursion;

import java.util.Scanner;

public class Print1toN {
   public static void main(String args[])
   {
       printN(1,5);
   }
   public static void printN(int i,int n){
       if(i>n)
       {
           return;
       }
       System.out.println(i);
       printN(i+1,n);
   }
}
