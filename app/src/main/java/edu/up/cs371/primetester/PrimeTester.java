package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     * resource: http://www.java67.com/2014/01/how-to-check-if-given-number-is-prime.html
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        int sqrt = (int) Math.sqrt(n) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }
}
