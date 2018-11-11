package algos.projecteuler;

import algos.reusable.FibonacciSequence;

//1000-digit Fibonacci number = https://projecteuler.net/problem=25
public class Problem25
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        return FibonacciSequence.getIndexOfTermWith1000Digits();
    }
}