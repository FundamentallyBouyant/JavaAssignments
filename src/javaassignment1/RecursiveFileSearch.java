package javaassignment1;


/**
 * Created by Jay Dadhania on 24/7/17.
 */

import com.sun.org.apache.regexp.internal.RE;

import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

/**
 * File search implementation
 */
class RecursiveFileSearch {


    /**
     * Recursive file search using regex pattern
     * @param regex Regex patter to search file
     * @param initPath Path of the directory to search in
     * @param fileCount default value zero
     * @return total files found
     */
    public int fileSearch(String regex, String initPath,int fileCount) {
        File file = new File(initPath);
        File[] fileList = file.listFiles();
        if (fileList != null)
            for (File eachFile : fileList) {
                if (eachFile.isDirectory()) {
                    fileCount=fileSearch(regex, eachFile.getPath(),fileCount);
                } else if (fileMatcher(regex,eachFile)) {
                    System.out.println(eachFile.getPath());
                    fileCount++;
                }
            }
        return fileCount;
    }

    /**
     * Overloaded method fileSearch() with defaut fileCount = 0;
     * @param regex Regex pattern to search file
     * @param initPath Path of the directory to search in
     * @return total files found
     */
    public int fileSearch(String regex, String initPath){
        return fileSearch(regex,initPath,0);
    }

    /**
     * Method to match filename with regex pattern
     * @param regexPattern Regex pattern to search file
     * @param file a File object
     * @return true if pattern matches; false otherwise
     */
    public static Boolean fileMatcher(String regexPattern,File file){
        Pattern filePattern = Pattern.compile(regexPattern);
        Matcher m = filePattern.matcher(file.getName());
        return m.matches();
    }

    public static void main(String[] args) {
        Boolean exit = false;
        RecursiveFileSearch fs = new RecursiveFileSearch();
        while(exit==false) {

            Scanner sc = new Scanner(System.in);
            String path = "/home";
            System.out.println("Enter regex pattern to match file name : ");
            String fileRegex = "";
            fileRegex = sc.next();
            System.out.println(fs.fileSearch(fileRegex,path) + " file(s) found.\n");
            System.out.println("Enter 'Q' to quit. Any key to continue. ");
            char input = sc.next().charAt(0);
            if(input == 'q' || input == 'Q'){
                exit = true;
            }

        }
        System.out.println("Exiting...");
    }
}