package javaassignment4;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Jay Dadhania on 25/7/17.
 */

/**
 * Date range for KYC application
 */
public class DateRange {
    static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    /**
     *Reads input and returns a DatePair object
     * @return a DatePair object
     * @throws Exception If input is not given in correct format
     */
    public static DatePair[] readInput() throws Exception{
        int inputLength;
        String[] line;
        DatePair[] inputDatePair;
        Scanner sc = new Scanner(System.in);
        inputLength = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        inputDatePair = new DatePair[inputLength];
        try {
            for (int i = 0; i < inputLength; i++) {
                line = sc.nextLine().split(" ");
                inputDatePair[i] = new DatePair(formatter.parse(line[0]), formatter.parse(line[1]));
            }
        } catch (Exception e){
            System.out.println("Enter input in correct format.");
        }
        return inputDatePair;
    }

    /**
     * Gives date range for the KYC application form
     * @param inputDates DatePair object containing
     * @return String containing date range
     */
    public static String getRange(DatePair inputDates){

        Calendar startDate = GregorianCalendar.getInstance();
        Calendar today = GregorianCalendar.getInstance();
        Calendar endDate = GregorianCalendar.getInstance();
        int currentYear;
        today.setTime(inputDates.date2);
        currentYear = today.get(Calendar.YEAR);
        startDate.setTime(inputDates.date1);
        startDate.set(Calendar.YEAR,currentYear);
        startDate.add(Calendar.DAY_OF_YEAR,-30);
        endDate.setTime(inputDates.date1);
        endDate.set(Calendar.YEAR,currentYear);
        endDate.add(Calendar.DAY_OF_YEAR,+30);
        if(inputDates.date1.compareTo(inputDates.date2)>0){
            return "No range";
        }
        int flag1 = startDate.compareTo(today);
        int flag2 = endDate.compareTo(today);
        if(flag1>=0){
            startDate.add(Calendar.YEAR,-1);
            endDate.add(Calendar.YEAR,-1);
        } else if (flag1<0 && flag2>0){
            endDate = today;
        }
        return formatter.format(startDate.getTime()) + " " + formatter.format(endDate.getTime());
    }

    private static class DatePair{
        Date date1;
        Date date2;
        public DatePair(Date date1,Date date2) {
            this.date1=date1;
            this.date2=date2;
        }
    }

    public static void main(String[] args){
        try {
            DatePair[] inputDatePair = readInput();
            System.out.println("\n");
            for (DatePair inputDate : inputDatePair){
                System.out.println(getRange(inputDate));
            }
        }catch (Exception ioe){
            System.out.println("Enter input in correct format.");
        }

    }
}
