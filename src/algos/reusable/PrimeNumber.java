package algos.reusable;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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
    
    
    public static boolean areRelativePrimeNumbers(long x, long y)
    {
        return GreatestCommonDivisor.getGCD(x, y).compareTo(BigInteger.ONE) == 0;
    }
    
    
    public static List<Integer> getPrimeNumbersBelow(int x)
    {
        List<Integer> primesBelowX = new ArrayList<Integer>();
        
        if(x > 1)
        {
            IntStream.range(2, x).filter(i -> isPrimeNumber(i)).forEach(i -> primesBelowX.add(i));
        }
        
        return primesBelowX;
    }
}