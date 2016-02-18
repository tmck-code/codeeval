/*******************************************************************************
 *
 * Class Name:        StringPermutations
 *
 * @author:           Thomas McKeesick
 * Creation Date:     Monday, February 16 2015, 23:10
 * Last Modified:     Monday, February 16 2015, 23:37
 */

import java.util.ArrayList;
import java.util.Collections;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.IOException;

class Main {

    static ArrayList<ArrayList<String>> results;

    public static void main(String args[]) {

        if(args.length != 1) {
            System.err.println("Must include a file to load");
            System.exit(1);
        }

        ArrayList<String> strArray = loadFile(args[0]);
        results = new ArrayList<ArrayList<String>>();
        for(String str : strArray) {
            permute(str);
        }

        for(ArrayList<String> arr : results) {
            Collections.sort(arr);
            for(int i = 0; i < arr.size() - 1; i++) {
                System.out.print(arr.get(i) + ",");
            }
            System.out.println(arr.get(arr.size()-1));
        }

        System.exit(0);
    }

    /**
     * Outer permute method, creates a new ArrayList for this line of the file
     * and calls the inner permute method.
     */
    private static void permute(String str) {
        ArrayList<String> tmp = new ArrayList<String>();
        permute("", str, str.length(), tmp);
        results.add(tmp);
    }

    /**
     * Private function that recursively generated all permutations of a given
     * string in alphabetical order. If the length is correct, it is added to 
     * the result array
     */
    private static void permute(String prefix, String str, int strLength,
                                ArrayList<String> perms) {
        int length = str.length();

        //Checks if the permutation is the correct length
        if(prefix.length() == strLength) {
            perms.add(prefix);
        }
        if( length != 0 ) {
            for(int i = 0; i < length; i++) {
                permute(prefix + str.charAt(i),
                    str.substring(0, i) + str.substring(i+1, length),
                    strLength, perms);
            }
        }
    }

    /**
     * A method that loads given file into an ArrayList
     * @param filename The file to load
     * @return The ArrayList containing the dictionary
     */
    private static ArrayList<String> loadFile(String filename) {
        ArrayList<String> tmp = new ArrayList<String>();
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(filename));
            String word;
            while( (word = in.readLine()) != null ) {
                tmp.add(word);
            }
        } catch( IOException e ) {
            System.err.println("A file error occurred: " + filename +
                               "\nError message: " + e.getMessage());
            System.exit(1);
        }
        return tmp;
    }
}