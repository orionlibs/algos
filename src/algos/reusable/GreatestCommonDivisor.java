package algos.reusable;

import java.math.BigInteger;

public class GreatestCommonDivisor
{
    public static BigInteger getGCD(BigInteger x, BigInteger y)
    {
        return x.gcd(y);
    }
    
    
    public static BigInteger getGCD(long x, long y)
    {
        return getGCD(BigInteger.valueOf(x), BigInteger.valueOf(y));
    }
    
    
    public static long getGCDAsLong(BigInteger x, BigInteger y)
    {
        return x.gcd(y).longValue();
    }
    
    
    public static long getGCDAsLong(long x, long y)
    {
        return getGCD(x, y).longValue();
    }
}