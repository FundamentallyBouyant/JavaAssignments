package assignment3_2;

/**
 * Created by Jay Dadhania on 16/7/17.
 */
public class Main {
    public static void main(String[] args) {
        Cycle[] myCycles = {new Unicycle(),new Bicycle(),new Tricycle()};
        for(Cycle theCycle : myCycles){
//            Can't call balance method on Cycle objects
//            theCycle.balance();
        }


        //Downcasting
        ((Unicycle) myCycles[0]).balance();
        ((Bicycle) myCycles[1]).balance();
    }
}
