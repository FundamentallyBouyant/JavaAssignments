package jay.assignment;
/*Create another class in package yourname.assignment.singleton containing a non static String member variable. Add a static method that takes String as parameter and initialize the member variable and then return object of that class. Add a non static method to print the String.*/
/**
 * Created by Jay Dadhania on 10/7/17.
 */
public class singleton {
    String s;
    static singleton initString(String r){
    /* Non static variable s can not be used in a static method */
//        s = r;
        return new singleton();
    }
    void printSingleton() {
        System.out.println(s);
    }

    public static void main(String[] args) {
        singleton ss =new singleton();
        ss.printSingleton();


    }
}
