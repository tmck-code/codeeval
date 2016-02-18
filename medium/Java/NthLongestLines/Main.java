/*
 * Class Name:    Main
 *
 * Author:        Thomas McKeesick
 * Creation Date:     Saturday, February 07 2015, 13:54 
 * Last Modified:     Saturday, February 07 2015, 22:54
 * 
 * Class Description: Java class to find the nth longest lines in a file
 *
 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {

    static int N_LONG_LINES = 0;

    private static class LengthFirstComparator implements Comparator<String> {
    @Override
        public int compare(String s1, String s2) {             
            if (s1.length()!=s2.length()) {
                return s1.length()-s2.length();
            }
            return s1.compareTo(s2);
        }
    }

    public static void main( String args[] ) {

        if( args.length != 1 ) {
            System.err.println("Must supply a filename");
            System.exit(1);
        }
        ArrayList<String> fileLines = loadFile(args[0]);

        Collections.sort(fileLines, new LengthFirstComparator());

        for(int i = fileLines.size() -1 ; i >= fileLines.size() - N_LONG_LINES; i--) {
            System.out.println(fileLines.get(i));
        }

    }
    private static ArrayList<String> loadFile(String filename) {
        ArrayList<String> tmp = new ArrayList<String>();
        try {
            BufferedReader in = new BufferedReader( new FileReader( filename ) );
            N_LONG_LINES = Integer.parseInt(in.readLine());
            String line;

            while( (line = in.readLine()) != null ) {
                tmp.add(line);
            }
        } catch(IOException e) {
            System.err.println("File error occurred: " + e.getMessage());
            System.exit(1);
        }
        return tmp;
    }
}

