package assignment3_3;

/**
 * Created by Jay Dadhania on 16/7/17.
 */
public class RealHomeEntertainment extends BoardGames implements HomeEntertainment{

    public void speakers() {
        System.out.println("Harman");
    }

    public void speakerControl() {
        System.out.println("Wireless speakers");
    }

    public void ps3() {
        System.out.println("Time to upgrade to ps4.");
    }

    public void ps3Controller() {
        System.out.println("Need to charge this again");
    }

    public void tv() {
        System.out.println("Idiot Box");
    }

    public void tvRmote() {
        System.out.println("What is dead? Remote or batteries.");
    }

    public void gameOn() { System.out.println("Ohh Yeah!");  }

    void display(Display a){
        a.tv();
        a.tvRmote();
    }
    void gaming(Game b){
        b.ps3();
        b.ps3Controller();
    }
    void sound(Sound c){
        c.speakers();
        c.speakerControl();
    }
    void homeFun(HomeEntertainment d){
        d.gameOn();
    }

    public static void main(String[] args) {
        RealHomeEntertainment myHome = new RealHomeEntertainment();
        myHome.display(myHome);
        myHome.gaming(myHome);
        myHome.sound(myHome);
        myHome.homeFun(myHome);
    }
}
