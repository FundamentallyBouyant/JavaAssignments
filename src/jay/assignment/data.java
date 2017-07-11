package jay.assignment;

//Create a class in a package yourname.assignment.data containing an int and a char member variables that are not initialized, add a method to print these variables. Add another method in the same class with two local variables and print their values without initializing them.

/**
 * Created by Jay Dadhania on 10/7/17.
 */

public class data {
    static int i;
    static char a;

    public void printMembers(){
        System.out.println("The integer is : "+i);
        System.out.println("The character is : "+a);
    }
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
