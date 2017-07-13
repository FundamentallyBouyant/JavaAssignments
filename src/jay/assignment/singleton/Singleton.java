package jay.assignment.singleton;
/**
 * Created by Jay Dadhania on 10/7/17.
 */

/**Singleton class for DefaultInitializationAssignment
 */
public class Singleton {
    public String s;

    /**
     *
     * @param r String parameter
     * @return Returns object of Singleton class
     */
    static Singleton initString(String r){
//     Non static variable s can not be used in a static method
//        s = "\0";
        return new Singleton();
    }

    /**
     * Prints member String variable
     */
    void printSingleton() {
        System.out.println(s);
    }
}
