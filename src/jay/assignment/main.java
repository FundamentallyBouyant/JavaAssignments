package jay.assignment;

//Create main class in package yourname.assignment.main, create object of first class and call both the methods to print the values. Create object of second class using static method and then call the other method to print the String.

/**
 * Created by Jay Dadhania on 10/7/17.
 */
public class main{
    data DataObj = new data();
    static singleton SingleObj = new singleton();


    public static void main(String[] args) {
        /* Can not call non-static object from static main*/
//        DataObj.printMembers();
//        DataObj.printVars();
        SingleObj.printSingleton();
    }

}
