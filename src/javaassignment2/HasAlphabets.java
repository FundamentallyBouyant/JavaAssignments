package javaassignment2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Jay Dadhania on 24/7/17.
 */
public class HasAlphabets {
    //O(n) in time and space
    public static Boolean HasAllAlphabets(String inputString) {
        Boolean[] foundAlphabet = new Boolean[26];
        Arrays.fill(foundAlphabet,false);
        char[] stringArray = inputString.toCharArray();
        for (char eachCharacter : stringArray) {
            if(Character.isLetter(eachCharacter)) foundAlphabet[(int) Character.toLowerCase(eachCharacter) - (int) 'a'] = true;
        }
        return !Arrays.asList(foundAlphabet).contains(false);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("example input : The quick brown fox jumps over a lazy dog.\nGive input to check if it has all alphabets : ");
        String s = sc.nextLine();
        if (HasAllAlphabets(s)) System.out.println("Has all alphabets.");
        else System.out.println("Does not have all alphabets.");
    }
}
