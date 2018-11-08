package algos.reusable;

import java.math.BigInteger;

public class Factorial
{
    public static BigInteger getFactorial(long n)
    {
        BigInteger factorial = BigInteger.ONE;
        
        for(long i = n; i > 1; i--)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        return factorial;
    }
}