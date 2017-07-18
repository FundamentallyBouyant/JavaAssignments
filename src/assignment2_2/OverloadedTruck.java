package assignment2_2;

/**
 * Created by Jay Dadhania on 13/7/17.
 */
public class OverloadedTruck {
    int noOfWheels;
    int tonnesOfLoad;

    OverloadedTruck(int wheels){
        noOfWheels = wheels;
    }
    OverloadedTruck(int wheels, int load){
        this(wheels);
        this.tonnesOfLoad = load;
    }
}
