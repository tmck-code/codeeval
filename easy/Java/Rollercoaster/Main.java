/*
 * Class Name:        Main
 *
 * @author:           Thomas McKeesick
 * Creation Date:     Saturday, January 24 2015, 13:35 
 * Last Modified:     Saturday, January 24 2015, 14:22
 * 
 * Class Description: A program that turns text from an input file into 
 *         RoLlErCoAsTeR format, as per the CodeEval challenge description
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main( String[] args ) {
        if( args.length != 1 ) {
            System.err.println("Must input a filename");
            System.exit(1);
        }
        
        try {
            BufferedReader in = new BufferedReader( 
                    new FileReader( args[0] ));
            String line;
            while( (line = in.readLine()) != null ) {
                int count = 0;
                for( char c : line.toCharArray() ) {
                    if( Character.isLetter(c)) {
                        System.out.print( count % 2 == 0 ?
                                Character.toUpperCase(c) :
                                Character.toLowerCase(c));
                        count++;
                    } else {
                        System.out.print(c);
                    }
                }
                System.out.println();
            }
        } catch( IOException e ) {
            System.err.println("A file I/O error occurred: " + args[0]);
            System.exit(1);
        }
   }
}

