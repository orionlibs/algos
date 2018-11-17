package algos.reusable;

import java.math.BigInteger;

public class Combinations
{
    public static BigInteger getNumberOfCombinations(long n, long r)
    {
        return Factorial.getFactorial(n).divide(Factorial.getFactorial(r).multiply(Factorial.getFactorial(n - r)));
    }
}