package Assignment2;
//import java.lang.*;
import java.util.Arrays;


/**
 * Created by Jay Dadhania on 12/7/17.
 */


public class VampNumbers {

    static Boolean checkIfVampFangs(int fang1, int fang2){
        String fang1String = Integer.toString(fang1);
        String fang2String = Integer.toString(fang2);
        if(fang1String.length() == fang2String.length() && !(fang1%10==0 && fang2%10 == 0)){
            String vampString = Integer.toString(fang1*fang2);
            String teethString = fang1String + fang2String;

            char[] vampArray = vampString.toCharArray();
            char[] teethArray = teethString.toCharArray();

            Arrays.sort(vampArray);
            Arrays.sort(teethArray);

            if(Arrays.equals(vampArray,teethArray)) return true;
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(VampNumbers.checkIfVampFangs(1620,8073));
        int i = 10;
        int count = 0;
        while(count<10){
            for(int j= i; j< i*10;j++) {
                for (int k = j; k < i*10 ; k++) {
//                    System.out.println("aaaa");
//                    System.out.println(count+ " " +(j*k));
                    if (checkIfVampFangs(j, k)) {
                        count++;
                        System.out.println( count+": "+j + " " + k + " = " + (j*k));
                    }
                }

            }
            i = i*10;
        }
    }
}
