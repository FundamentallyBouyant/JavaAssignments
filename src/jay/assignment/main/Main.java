package jay.assignment1.main;

import jay.assignment1.data.Data;
import jay.assignment1.singleton.Singleton;

/**
 * Created by Jay Dadhania on 10/7/17.
 */

/**
 * Main class for DefaultInitializationAssignment
 */
public class Main {
    /**
     * Entry point to class
     * @param args Array of strings
     */
    public static void main(String[] args) {
        Data DataObj = new Data();
        DataObj.printMembers();
        DataObj.printVars();
        createSingleton();
    }

    /**
     * Prints string member from Singleton class
     */
    static void createSingleton(){
        Singleton SingleObj = new Singleton();
        System.out.println(SingleObj.s);
    }

}
