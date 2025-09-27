package Leetcode;

public class Q_151_Reverse_word_in_String {
        public static void main(String args[])
        {   String s="Hello Aditya";
            System.out.println(reverseWords(s));
        }

    private static String reverseWords(String s) {
            String s1[]=s.trim().split("\\s+");
            String ans="";

            for(int i=s1.length-1;i>0;i--)
            {
                ans+=s1[i]+" ";
            }
            return ans+s1[0];

    }
//        Brute Force Approch


//        public static String reverseWords(String s) {
//            int n=s.length();
//            String ans="";
//            for(int i=s.length()-1;i>=0;i--)
//            {
//                if(s.charAt(i)==' '|| i==0)
//                {
//                    int start=(i==0)?0:i+1;
//
//                    while (start < n && s.charAt(start) == ' ') start++;
//
//                    if(start<n)
//                    {
//                        for(int j=start;j<n;j++)
//                        {
//                            ans = ans +  s.charAt(j);
//                        }
//                        ans+=" ";
//                    }
//                    n=i;
//                }
//            }
//            return ans.trim();
//        }
}
