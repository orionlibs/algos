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
}