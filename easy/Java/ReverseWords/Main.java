/*
 * Class Name:        Main
 *
 * @author            Thomas McKeesick
 * Creation Date:     Wednesday, January 28 2015, 12:52 
 * Last Modified:     Saturday, February 07 2015, 13:44
 * 
 * Class Description: A java class to reverse a series of words from a 
 *         supplied file, as per the CodeEval challenge instructions.
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main( String args[] ) {
        if( args.length != 1 ) {
            System.err.println("Must include a filename argument");
            System.exit(1);
        }
        try {
            BufferedReader in = new BufferedReader( 
                    new FileReader( args[0] ));
            String line;

            while( (line = in.readLine()) != null ) {
                String[] words = line.split(" ");
                String reverse = words[words.length - 1];

                for( int i = words.length - 2; i >= 0; i-- ) {
                    reverse += " " + words[i];
                }
                System.out.println(reverse);
            }
        } catch( IOException e ) {
            System.err.println("File error occurred");
            System.exit(1);
        }
        System.exit(0);
    }

}
