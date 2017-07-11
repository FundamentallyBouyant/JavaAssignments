package jay.assignment;
/**
 * Created by Jay Dadhania on 10/7/17.
 */
public class main{

    public static void main(String[] args) {
        data DataObj = new data();
        DataObj.printMembers();
        DataObj.printVars();
        createSingleton();
    }

    static void createSingleton(){
        singleton SingleObj = new singleton();
        System.out.println(SingleObj.s);
    }

}
