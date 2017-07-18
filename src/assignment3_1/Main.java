package assignment3_1;

/**
 * Created by Jay Dadhania on 16/7/17.
 */
public class Main {
    public static void main(String[] args) {
        Rodent[] rodentFriends = { new Mouse(),new Gerbil(), new Hamster(), new Squirrel()};
        for(Rodent theRodent : rodentFriends ){
            theRodent.tail();
            theRodent.doStuff();
        }
    }
}
