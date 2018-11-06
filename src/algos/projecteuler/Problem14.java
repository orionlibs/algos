package algos.projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

//Longest Collatz sequence = https://projecteuler.net/problem=14
public class Problem14
{
    private static long maxSequenceSize = 0;
    private static long maxTerm = 0;
    
    
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        for(int i = 1; i < 1000000; i++)
        {
            buildSequence(i);
        }
        
        return maxTerm;
    }
    
    
    private static void buildSequence(int startingNumber)
    {
        List<BigInteger> sequence = new ArrayList<BigInteger>();
        BigInteger startingTerm = BigInteger.valueOf(startingNumber);
        sequence.add(startingTerm);
        BigInteger currentTerm = startingTerm;
        
        while(currentTerm.compareTo(BigInteger.ONE) != 0)
        {
            if(currentTerm.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0)
            {
                currentTerm = currentTerm.divide(BigInteger.valueOf(2));
            }
            else
            {
                currentTerm = currentTerm.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            }
            
            sequence.add(currentTerm);
            checkForMax(sequence, startingNumber);
        }
    }
    
    
    private static void checkForMax(List<BigInteger> sequence, int startingNumber)
    {
        if(sequence.size() > maxSequenceSize)
        {
            maxSequenceSize = sequence.size();
            maxTerm = startingNumber;
        }
    }
}