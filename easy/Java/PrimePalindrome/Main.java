/*
 * Class Name:        Main class for the Prime Palindrome challenge on CodeEval
 *
 * @author            Thomas McKeesick
 * Creation Date:     Saturday, January 24 2015, 11:51 
 * Last Modified:     Saturday, January 24 2015, 13:11
 * 
 * Class Description: Prints to stdout the largest prime palindrome that is less
 *         than 1000
 */

public class Main
{
    public static void main(String args[])
    {
        for( int i = 1000; i > 0; i-- ) {
            if( isPrime(i) ) {
                if(isPalindrome(i)) {
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
        System.exit(0);
    }

    public static boolean isPrime( int num ) {
        if( num % 2 == 0 ){
            return false;
        }
        for( int i = 3; i*i <= num; i += 2 ) {
            if( num % i == 0 ) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome( int num ) {
        StringBuilder numString = new StringBuilder();
        numString.append(num);
        for( int i = 0; i < (numString.length()-1) / 2; i++ ) {
            if( numString.charAt(i) !=
                numString.charAt( numString.length() - 1 - i )) {
                return false;
            }
        }
        return true;
    }
}

