package jay.assignment;
/**
 * Created by Jay Dadhania on 10/7/17.
 */
public class singleton {
    String s;
    static singleton initString(String r){
//     Non static variable s can not be used in a static method
//        s = '\0';
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
