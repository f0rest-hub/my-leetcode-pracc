package org.kev;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringLeetCode stringLeetCode = new StringLeetCode();
        //int result = stringLeetCode.scoreOfString("hello");

//        int result = stringLeetCode.findPermutationDifference("abcde", "edbac");
//        int result = stringLeetCode.finalValueAfterOperations(new String[]{"--X", "X++", "X++"});
//        int result = stringLeetCode.minPartitions("1234762385");
//        int result = stringLeetCode.numJewelsInStones("aA", "aAAbbbb");
//        List<Integer> result = stringLeetCode.findWordsContaining(new String[] {"Kev","Kity","Kev"}, 'e');
//        int result = stringLeetCode.mostWordsFound(new String[]{"alice and bob love leetcode","i think so too","this is great thanks very much"});
        String result = stringLeetCode.reversePrefix("abcdefd", 'd');

        System.out.println("Result = "+result);
    }
}