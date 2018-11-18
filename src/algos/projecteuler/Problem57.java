package algos.projecteuler;

import java.math.BigInteger;

//Square root convergents = https://projecteuler.net/problem=57
public class Problem57
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long result = 0;
        BigInteger numerator = BigInteger.valueOf(3);
        BigInteger denominator = BigInteger.valueOf(2);
        
        for(int i = 0; i < 999; i++)
        {
            numerator = numerator.add(BigInteger.valueOf(2).multiply(denominator));
            denominator = numerator.subtract(denominator);
            
            if((int)Math.log10(numerator.doubleValue()) > (int)Math.log10(denominator.doubleValue()))
            {
                result++;
            }
        }
        
        return result;
    }
}