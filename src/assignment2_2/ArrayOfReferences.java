package assignment2_2;

/**
 * Created by Jay Dadhania on 13/7/17.
 */
public class ArrayOfReferences {



    public static void main(String[] args) {
        //This does not call the constructor (only references are stored in the array and does not print the string
        exampleClass[] arrayOfReferences = new exampleClass[10];

        for(int i=0;i<10;i++){
            //Calls the constructor and prints the string
            arrayOfReferences[i] = new exampleClass(Integer.toString(i));

        }

    }

}
class exampleClass{
    String exampleString;

    exampleClass(String inputString){
        System.out.println(inputString);
        exampleString = inputString;
    }
}
