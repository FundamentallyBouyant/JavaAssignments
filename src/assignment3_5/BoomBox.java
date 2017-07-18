package assignment3_5;

/**
 * Created by Jay Dadhania on 17/7/17.
 */
public class BoomBox {
    static class cdPlayer extends MusicSystem.mp3Player{
        cdPlayer(MusicSystem ms,String Description){
            ms.super(Description);
            System.out.println(Description);
        }
    }

    public static void main(String[] args) {
        MusicSystem ms = new MusicSystem();
        cdPlayer myCdPlayer = new cdPlayer(ms,"My CD Player");
    }
}
