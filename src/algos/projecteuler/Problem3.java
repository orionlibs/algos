package algos.projecteuler;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

//Largest prime factor = https://projecteuler.net/problem=3
public class Problem3
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        long primeFactor = 0L;
        
        for(long i = 2; i < Math.sqrt(600851475143L); i++)
        {
            if(600851475143L % i == 0 && BigInteger.valueOf(i).isProbablePrime(1))
            {
                primeFactor = i;
            }
        }
        
        return primeFactor;
    }
}