/*
 * File Name:         main.cpp
 *
 * @author:           Thomas McKeesick
 * Creation Date:     Saturday, January 24 2015, 14:25 
 * Last Modified:     Saturday, January 24 2015, 14:44
 * 
 * File Description:  Program that calculates the sum of the first 1000 prime
 *         numbers, as per the CodeEval challenge
 */

#include <iostream>

using std::cout;
using std::endl;

bool isPrime( int num ) {
    if( num % 2 == 0 ) {
        return false;
    }
    for( int i = 3; i*i <= num; i += 2 ) {
        if( num % i == 0 ) {
            return false;
        }
    }
    return true;
}

int main() {
    int primeCount = 0;
    int num = 0;
    int sum = 1;
    while( primeCount < 1000 ) {
        if( isPrime(num) ) {
            sum += num;
            primeCount++;
        }
        num++;
    }
    cout << sum << endl;
}

