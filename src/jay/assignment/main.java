package jay.assignment;
/**
 * Created by Jay Dadhania on 10/7/17.
 */

/**
 * main class for DefaultInitializationAssignment
 */
public class main{
    /**
     * Entry point to class
     * @param args Array of strings
     */
    public static void main(String[] args) {
        data DataObj = new data();
        DataObj.printMembers();
        DataObj.printVars();
        createSingleton();
    }

    /**
     * Prints string member from singleton class
     */
    static void createSingleton(){
        singleton SingleObj = new singleton();
        System.out.println(SingleObj.s);
    }

}
