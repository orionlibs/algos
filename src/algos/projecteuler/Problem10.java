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
        long sum = 2;
        
        for(int i = 3; i < 2000000; i++)
        {
            if(i % 2 != 0 && BigInteger.valueOf(i).isProbablePrime(50))
            {
                sum += i;
            }
        }
        
        return sum;
    }
}