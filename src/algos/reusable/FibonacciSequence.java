package algos.reusable;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence
{
    public static BigInteger getNthTerm(long n)
    {
        BigInteger termMinus2 = BigInteger.ONE;
        BigInteger termMinus1 = BigInteger.ONE;
        BigInteger termN = BigInteger.ONE;
        
        for(long i = 3; i <= n; i++)
        {
            termN = termMinus1.add(termMinus2);
            termMinus2 = termMinus1;
            termMinus1 = termN;
        }
        
        return termN;
    }
    
    
    public static long getTermIndex(BigInteger n)
    {
        BigInteger termMinus2 = BigInteger.ONE;
        BigInteger termMinus1 = BigInteger.ONE;
        BigInteger termN = BigInteger.ONE;
        
        for(long i = 3; i <= Integer.MAX_VALUE; i++)
        {
            termN = termMinus1.add(termMinus2);
            
            if(termN.equals(n))
            {
                return i;
            }
            
            termMinus2 = termMinus1;
            termMinus1 = termN;
        }
        
        return 0;
    }
    
    
    public static List<BigInteger> getFirstNTerms(long n)
    {
        List<BigInteger> terms = new ArrayList<BigInteger>();
        BigInteger termMinus2 = BigInteger.ONE;
        BigInteger termMinus1 = BigInteger.ONE;
        BigInteger termN = BigInteger.ONE;
        
        for(long i = 3; i <= n; i++)
        {
            termN = termMinus1.add(termMinus2);
            termMinus2 = termMinus1;
            termMinus1 = termN;
            terms.add(termN);
        }
        
        return terms;
    }
    
    
    public static long getIndexOfTermWith1000Digits()
    {
        BigInteger termNMinus2 = BigInteger.ONE;
        BigInteger termNMinus1 = BigInteger.ONE;
        BigInteger termN = BigInteger.ONE;
        long index = 2;
        
        while(termN.toString().length() < 1000)
        {
            termN = termNMinus1.add(termNMinus2);
            termNMinus1 = termNMinus2;
            termNMinus2 = termN;
            ++index;
        }

        return index;
    }
}