package algos.projecteuler;

import java.math.BigInteger;

//1000-digit Fibonacci number = https://projecteuler.net/problem=25
public class Problem25
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
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