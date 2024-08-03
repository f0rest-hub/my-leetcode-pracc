package org.kev;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLeetCode {

    // https://leetcode.com/problems/score-of-a-string/description/
    public int scoreOfString(String s) {
        int finalScore = 0;

        for (int i=0; i<s.length() - 1; i++){
            int ascii1 = (int) s.charAt(i);
            int ascii2 = (int) s.charAt(i+1);
            //char ch2 = s.charAt(i+1);

            finalScore = finalScore + Math.abs(ascii1 - ascii2);
//            finalScore = finalScore + Math.abs((int) s.charAt(i) - (int) s.charAt(i+1));
        }
        return finalScore;
    }

    // https://leetcode.com/problems/permutation-difference-between-two-strings/description/
    public int findPermutationDifference(String s, String t) {
        int finalDifference = 0;
        for (int i=0; i<s.length(); i++){
            System.out.println("Comparing 1st string char ="+s.charAt(i));
            for (int j=0; j<t.length(); j++){
                System.out.println("Comparing 2nd string char ="+t.charAt(j));
                if (s.charAt(i) == t.charAt(j)){
                    System.out.println("Chars are equal. Abs for given chars ="+Math.abs(i-j));
                    finalDifference = finalDifference + Math.abs(i - j);
                    break;
                }
            }
        }
        return finalDifference;
    }

    // https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
    public int finalValueAfterOperations(String[] operations) {
        int finalValue = 0;

        for(String ch : operations){
            switch(ch){
                case "--X", "X--": finalValue-=1;
                    break;
                case "X++", "++X": finalValue+=1;
                    break;
                default: finalValue+=0;
            }
        }
        return finalValue;
    }

    // https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/
    public int minPartitions(String n) {
        int biggestNum = 0;
        for (int i=0; i<n.length(); i++){
            int digit = n.charAt(i) - '0';
            if(digit > biggestNum){
                biggestNum = digit;
            }
        }
        return biggestNum;
    }

    // https://leetcode.com/problems/jewels-and-stones/
    public int numJewelsInStones(String jewels, String stones) {
        int numOfJewels = 0;
        for (int i=0; i<jewels.length(); i++){
            for (int j=0; j<stones.length(); j++){
                if (stones.charAt(j) == jewels.charAt(i)){
                    numOfJewels++;
                }
            }
        }
        return numOfJewels;
    }

    // https://leetcode.com/problems/find-words-containing-character/description/
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> finalList = new ArrayList<>();
//        for (String word: words){
//            if (word.contains(String.valueOf(x))){
//                finalList.add(Arrays.asList(words).indexOf(word));
//            }
//        }
        for (int i=0; i<words.length; i++){
            if (words[i].indexOf(x) != -1){
                finalList.add(i);
            }
        }
        return finalList;
    }

    // https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
    public int mostWordsFound(String[] sentences) {
        int mostNumOfWords = 0;
        for (String sentence: sentences){
            int numOfWords = sentence.split(" ").length;
            if (numOfWords > mostNumOfWords) {
                mostNumOfWords = numOfWords;
            }
        }
        return mostNumOfWords;
    }

    // https://leetcode.com/problems/reverse-prefix-of-word/
    public String reversePrefix(String word, char ch) {
        StringBuilder finalString = new StringBuilder();

        if (word.contains(String.valueOf(ch))) {
            String[] split = word.split(String.valueOf(ch), 2);
            return finalString.append(split[0]).reverse()
                                .insert(0, ch)
                                .append(split[1])
                                .toString();
        }
        else{
            return word;
        }
    }
}
