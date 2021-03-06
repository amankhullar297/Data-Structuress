
/*
Consider the following algorithm to generate a sequence of numbers.
Start with an integer n. If n is even, divide by 2. If n is odd, multiply by 3 and add 1.
Repeat this process with the new value of n, terminating when n = 1.

For example, the following sequence of numbers will be generated for n = 22:
22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1

It is conjectured (but not yet proven) that this algorithm will terminate at n = 1 for every integer n.
Still, the conjecture holds for all integers up to at least 1,000,000.
For an input n, the cycle-length of n is the number of numbers generated up to and including the 1.

In the example above, the cycle length of 22 is 16.

Given an integer n determine the cycle length .

Input: n = 22

Output: 16

Link : https://www.hackerrank.com/contests/doyoulikeit/challenges/the-3n-1-problem/submissions/code/1330991162
*/

public class Cyclicity {
    public static int printCycle(int n)
    {
        int count = 0;
        while(n != 1) {
            if(n % 2 == 0) {
                n /= 2;

            } else {
                n = 3*n +1;
            }
            count++;
        }
        return ++count;
    }
}