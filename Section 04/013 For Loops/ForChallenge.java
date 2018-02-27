package Basics.ControlFlow;
/*
 *
 * Write a isPrime method to determine if a number is a prime number
 *
 * If it's a prime number, print it and increment a count (number of prime numbers found)
 * if that count is 5 exit the loop
 *
 */

public class ForChallenge {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10; i <= 100; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
            }

            if(count == 5) {
                System.out.println("Exiting the loop");
                break;
            }
        }

    }

    // Check if it's a prime number
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
