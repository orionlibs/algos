package algos.projecteuler;

import java.math.BigInteger;

//Summation of primes = https://projecteuler.net/problem=10
public class Problem10
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        long sum = 0;
        
        for(int i = 2; i < 2000000; i++)
        {
            if(BigInteger.valueOf(i).isProbablePrime(100))
            {
                sum += i;
            }
        }
        
        return sum;
    }
}