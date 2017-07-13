package Assignment2;

import java.util.Arrays;

/**
 * Created by Jay Dadhania on 12/7/17.
 */
public class VampNumbers2 {
    static Boolean getFangs(int n,int lorange){
        for(int j= (int) Math.sqrt(lorange/10);j<= Math.sqrt(n);j++){
            int fang = n/j;
            if(fang*j == n){
                if(checkIfVampFangs(fang,j)){
                    return true;
                };
            }
        }
        return false;
    }
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

            if(Arrays.equals(vampArray,teethArray)){
                System.out.println(fang1*fang2 + " = " + fang1 + " * " + fang2);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int lorange = 1000;
        int count = 1;
        while((lorange < (Integer.MAX_VALUE / 1000))) {
            for (int i = lorange; i < lorange * 10; i++) {
                if (count > 100) return;
                if (getFangs(i, lorange)) {
                    count++;
                }
            }
            lorange *= 100;
        }
        getFangs(1260,1000);
    }
}
