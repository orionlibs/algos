package algos.reusable;

import java.math.BigInteger;

public class PrimeNumber
{
    public static boolean isPrimeNumber(BigInteger x)
    {
        return x.isProbablePrime(50);
    }
    
    
    public static boolean isPrimeNumber(long x)
    {
        return isPrimeNumber(BigInteger.valueOf(x));
    }
}