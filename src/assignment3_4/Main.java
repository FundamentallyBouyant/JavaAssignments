package assignment3_4;

/**
 * Created by Jay Dadhania on 17/7/17.
 */
public class Main {
    public static void main(String[] args) {
        Unicycle myUnicycle = UnicycleFactory.getUnicycle();
        myUnicycle.ringBell();
        Bicycle myBicycle = BicycleFactory.getBicycle();
        myBicycle.ringBell();
        Tricycle myTricycle = TricycleFactory.getTricycle();
        myTricycle.ringBell();
    }
}
