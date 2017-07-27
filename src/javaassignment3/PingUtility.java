package javaassignment3;


import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.*;
import java.util.*;

/**
 * Created by Jay Dadhania on 25/7/17.
 */
public class PingUtility {

    List<String> commandBuilder (int pingCount,String hostAddress){
        List<String> command= new ArrayList();
        command.add("ping");
        command.add("-c");
        command.add(Integer.toString(pingCount));
        command.add(hostAddress);
        return command;
    }

    List<String> runCommand(List command) throws IOException{
        String s;
        ProcessBuilder pb = new ProcessBuilder(command);
        Process pingProcess = pb.start();
        BufferedReader pingOutputBuffer = new BufferedReader(new InputStreamReader(pingProcess.getInputStream()));
        List<String> output = new ArrayList();
        while((s=pingOutputBuffer.readLine()) != null){
            output.add(s);
            if(s.contains("time=")) {
                System.out.println(s);
            }
//            System.out.println((returnResults(output).size()>0?("median = "+ median(returnResults(output))):""));
        }
        return output;
    }

    List<Float> returnResults(List<String> output){
        List<Float> pings = new ArrayList<>();
        for(String s : output){
            if(s.contains("time=")) {
                pings.add(Float.parseFloat(s.substring(s.lastIndexOf("=")+1, s.length() - 3)));
            }
        }
        if(pings.size()==0){
            System.out.println("Can not reach host!");
        }
        return pings;
    }

    public static float median (List<Float> list){
        Collections.sort(list);
        return (list.size()%2!=0? list.get(list.size()/2) : (list.get(list.size()/2) + list.get(list.size()/2 -1))/2);
    }

    public static void main(String[] args) throws IOException {
        PingUtility pu = new PingUtility();
        int pingCount = 0;
        List pings;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter host address to ping : ");
        String hostAddress = sc.nextLine();
        while(pingCount<=0){
            try {
                System.out.print("Enter number of times to ping the host : ");
                pingCount = Integer.parseInt(sc.nextLine());
            } catch (Exception e){
                System.out.println("Enter valid input.");
            }
    }

    pings = pu.returnResults(pu.runCommand(pu.commandBuilder(pingCount,hostAddress)));
    if(pings.size()>0){
        System.out.println("\nHost "+ hostAddress + " was pinged " + pingCount + " time(s).\nMedian ping = " + pu.median(pings) + "ms");
    }

    }
}
