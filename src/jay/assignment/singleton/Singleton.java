package jay.assignment1.singleton;
/**
 * Created by Jay Dadhania on 10/7/17.
 */

/**Singleton class for DefaultInitializationAssignment
 */
public class Singleton {
    public String s;
    Singleton singleton = new Singleton();

    private Singleton(){}
    /**
     *
     * @param r String parameter
     * @return Returns object of Singleton class
     */
    private Singleton initString(String r){
//     Non static variable s can not be used in a static method
        s = r;
        return new Singleton();
    }

    /**
     * Prints member String variable
     */
    void printSingleton() {
        System.out.println(s);
    }
}
