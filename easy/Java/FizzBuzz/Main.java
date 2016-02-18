/*
 * Class Name:        Main, as per the submission instructions for CodeEval
 *
 * @author            Thomas McKeesick
 * Creation Date:     Saturday, January 24 2015, 10:47
 * Last Modified:     Saturday, January 24 2015, 13:53
 *
 * Class Description: A FizzBuzz implementation as per the
 *         requirements on the CodeEval challenge.
 */

import java.io.FileReader;
import java.io.BufferedReader;

import java.io.IOException;

public class Main {
    public static void main( String[] args ) {

        if( args.length != 1 ) {
            System.err.println("Must enter one input FizzBuzz file");
            System.exit(1);
        }

        try {
            BufferedReader in = new BufferedReader(
                    new FileReader( args[0] ));
            String line = in.readLine();

            while( line != null ) {
                String[] split = line.split(" ");

                calcFizzBuzz( split );

                line = in.readLine();
            }
        } catch( IOException e ) {
            System.err.println("Error occurred when reading file: "
                    + args[0]);
            System.exit(1);
        }
        System.exit(0);
    }

    public static void calcFizzBuzz( String[] split )
    {
        if( split.length != 3 ) {
            System.err.println("Line error in file: " + split);
            System.exit(1);
        }
        int fizzDiv = Integer.parseInt( split[0] );
        int buzzDiv = Integer.parseInt( split[1] );
        int count = Integer.parseInt( split[2] );

        StringBuilder outline = new StringBuilder();

        for( int i = 1; i <= count; i++) {
            if( i % fizzDiv == 0 ) {
                outline.append("F");
            } else if ( i % buzzDiv == 0 ) {
                outline.append("B");
            } else {
                outline.append(i);
            }
            outline.append(" ");
        }
        //Delete trailing white space
        outline.deleteCharAt( outline.length() - 1 );

        System.out.println( outline.toString() );
    }
}

