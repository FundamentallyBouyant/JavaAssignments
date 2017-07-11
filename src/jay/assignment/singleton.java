package jay.assignment;
/**
 * Created by Jay Dadhania on 10/7/17.
 */

/**singleton class for DefaultInitializationAssignment
 */
public class singleton {
    String s;

    /**
     *
     * @param r String parameter
     * @return Returns object of singleton class
     */
    static singleton initString(String r){
//     Non static variable s can not be used in a static method
//        s = '\0';
        return new singleton();
    }

    /**
     * Prints member String variable
     */
    void printSingleton() {
        System.out.println(s);
    }
}
