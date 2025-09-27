package Leetcode;

public class Q_2114_Maximum_Number_of_Words_Found_in_Sentences {
    public static void main(String args[]){

        String str[]={"alice and bob love leetcode","i think so too","this is great thanks very much"};
        System.out.println(mostWordsFound(str));
    }


    public static int mostWordsFound(String[] sentences) {
            int max = 0; // stores the maximum word count found so far

            // Loop through each sentence in the array
            for (int i = 0; i < sentences.length; i++) {
                String s = sentences[i];
                int cnt = 1; // start with 1 because at least one word is always present

                // Count spaces in the sentence
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ' ') {
                        cnt++; // each space means a new word
                    }
                }

                // Update max if current sentence has more words
                max = Math.max(max, cnt);
            }

            // Return the maximum number of words found in any sentence
            return max;
        }

}
