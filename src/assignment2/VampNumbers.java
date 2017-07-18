package assignment2;

import java.util.Arrays;




 /**
 * Generates Vampire numbers
 * @author Jay Dadhania
 */
public class VampNumbers {
    /**
     * Prints fangs for a Number if it is a Vampire number
     * @param n Number to get fangs for
     * @param startRange Start range (i.e. 1000,1000000 etc.)
     * @return <code>true</code> if the number is a vampire number;
     *                  <code>false</code> otherwise.
     */
    public Boolean getFangs(int n,int startRange){
        for(int j= (int) Math.sqrt(startRange/10);j<= Math.sqrt(n);j++){
            int fang = n/j;
            if(fang*j == n){
                if(checkIfVampFangs(fang,j)){
                    return true;
                };
            }
        }
        return false;
    }

    /**
     * Check if two numbers can form a Vampire number if multiplied. Prints the Vampire number and fangs if they form a Vampire Number
     * @param fang1 First number
     * @param fang2 Second number
     * @return <code>true</code> if the numbers form a vampire number;
     *                  <code>false</code> otherwise.
     */
    public Boolean checkIfVampFangs(int fang1, int fang2){
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
                System.out.println(fang1*fang2 + " = (" + fang1 + " * " + fang2 +")");
                return true;
            }
        }
        return false;
    }

    public static void getVampireNumbers(int n){
        VampNumbers vamp = new VampNumbers();
        int startRange = 1000;
        int count = 1;
        while((startRange < (Integer.MAX_VALUE / 1000))) {
            for (int i = startRange; i < startRange * 10; i++) {
                if (count > n) return;
                if (vamp.getFangs(i, startRange)) {
                    count++;
                }
            }
            startRange *= 100;
        }
    }
    public static void main(String[] args) {
        getVampireNumbers(100);
    }
}
