package algos.reusable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class NumberFactors
{
    public static long getNumberOfFactors(long x)
    {
        return LongStream.range(1, x + 1).filter(i -> x % i == 0).count();
    }
    
    
    public static List<Long> getFactors(long x)
    {
        List<Long> factors = new ArrayList<Long>();
        
        for(long i = 1; i <= Math.sqrt(x); i++)
        {
            if(x % i == 0)
            {
                factors.add(i);
            }
        }
        
        return factors;
    }
    
    
    public static List<Long> getPrimeFactors(long x)
    {
        List<Long> factors = new ArrayList<Long>();
        
        for(long i = 2; i <= x; i++)
        {
            if(x % i == 0 && PrimeNumber.isPrimeNumber(i))
            {
                factors.add(i);
            }
        }
        
        return factors;
    }
}