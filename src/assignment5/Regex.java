package assignment5;

/**
 * Created by Jay Dadhania on 17/7/17.
 */

import java.util.Scanner;
import java.util.regex.*;

/**
 * Regex class to test regex pattern
 */
public class Regex {
    /**
     * Check whether a string is a sentence (Starts with a capital alphabet, ends with a period
     * @param s String to check
     * @return true if input is a sentence, false otherwise
     */
    public static Boolean isASentence(String s){
        Pattern p = Pattern.compile("[A-Z].*[.]");
        Matcher m = p.matcher(s);
        return m.matches();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(isASentence(s));
    }

}
