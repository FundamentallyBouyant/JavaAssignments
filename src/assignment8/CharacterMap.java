package assignment8;

/**
 * Created by Jay Dadhania on 21/7/17.
 */
import java.io.*;
import java.util.*;

/**
 * Run via console giving input file as argument to get the frequency of characters  in the file.
 */
public class CharacterMap {
    public static void main(String[] args) {

        Map<Character,Integer> charmap= new HashMap<Character,Integer>();
        Integer count;
        Character chr;
        try {
            Reader reader = new FileReader(args[0]);
            int nextchar = reader.read();
            while (nextchar!=-1) {
                chr = (char) nextchar;
                count = charmap.get(chr);
                charmap.put(chr,(count==null)?1:count+1);
                nextchar = reader.read();
            }
            reader.close();
            FileWriter writer = new FileWriter("charmap.txt");
            writer.write(charmap.toString());
            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.print(charmap);

    }
}

