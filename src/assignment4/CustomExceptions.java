package assignment4;

import java.util.Random;

/**
 * Created by Jay Dadhania on 17/7/17.
 */
public class CustomExceptions {
    public static void aiCheck(int answer) throws SystemIsSelfAwareException, SystemIsTakingControlException, InvalidEmotionException{
        if(answer == 42) throw new SystemIsSelfAwareException("You need to pull the plug now!");
        else if(answer > 42) throw new SystemIsTakingControlException("Run!");
        else if(answer < 42) throw new InvalidEmotionException("You gotta pump those numbers up!These are rookie numbers!");
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int answer = rand.nextInt(100);

        try{
            if(answer>60) {
                String s = null;
                s.length();
            }
            aiCheck(answer);
        } catch( SystemIsSelfAwareException | SystemIsTakingControlException | InvalidEmotionException e){
            System.out.println(e);
        } finally {
            System.out.println("Is this the real life?");  //finally block is executed even in case of NullPointerException not being handled
        }
    }

}

class InvalidEmotionException extends Exception{
    public InvalidEmotionException(String message) {
        super(message);
    }
}

class SystemIsSelfAwareException extends Exception{
    public SystemIsSelfAwareException(String message) {
        super(message);
    }
}

class SystemIsTakingControlException extends Exception{
    public SystemIsTakingControlException(String message) {
        super(message);
    }
}


