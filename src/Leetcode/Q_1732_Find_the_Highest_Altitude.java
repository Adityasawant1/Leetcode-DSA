package Leetcode;

public class Q_1732_Find_the_Highest_Altitude {
        public static void main(String args[])
        {
            int gain[]={-5,1,5,0,-7};
            System.out.println(largestAltitude(gain));
        }
        public static int largestAltitude(int[] gain) {
            int max=0;
            int sum=0;
            for(int val:gain)
            {
                sum+=val;
                max=Math.max(sum,max);
            }
            return max;
        }

}



//Approach: Prefix Sum / Running Sum
//The problem asks us to find the highest altitude reached by a biker after following a series of altitude changes given in the gain array.
//
//The biker starts at altitude 0.
//
//Each element in gain[i] represents the change in altitude between point i and i+1.
//
//To get the altitude at each step, we keep a running sum of these changes.
//
//Steps:
//
//Initialize two variables:
//
//sum = 0 → keeps track of the current altitude.
//
//max = 0 → keeps track of the highest altitude seen so far.
//
//Traverse the gain array:
//
//Add the current value (val) to sum.
//
//Update max as the maximum of current max and sum.
//
//At the end, max will hold the highest altitude reached.
//
//⏱️ Complexity Analysis
//
//Time Complexity: O(n) → we traverse the gain array once.
//
//Space Complexity: O(1) → only use two variables (sum, max).
