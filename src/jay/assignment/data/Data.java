package jay.assignment.data;


/**
 * Created by Jay Dadhania on 10/7/17.
 */


/** Data class for DefaultInitializationAssignment.
 * @author Jay
 */
public class Data {
    static int i;
    static char a;
    /** Prints the member variables of Data classPrints the member variables of the Data class
     */
    public void printMembers(){
        System.out.println("The integer is : "+i);
        System.out.println("The character is : "+a);
    }
    /** Prints variables declared in the method
     */
    public void printVars(){
        /*int j;
        char b;*/
        /* Variables declared inside methods are not initialized by default */
        int j = 0;
        char b = '\0';
        System.out.println("The integer is : "+j);
        System.out.println("The character is : "+b);
    }

}
