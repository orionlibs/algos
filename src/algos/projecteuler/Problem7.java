package algos.projecteuler;

import java.math.BigInteger;

//10001st prime = https://projecteuler.net/problem=7
public class Problem7
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        long i = 2;
        long primeIndex = 0;
        
        while(true)
        {
            if(BigInteger.valueOf(i).isProbablePrime(1))
            {
                ++primeIndex;
                
                if(primeIndex == 10001)
                {
                    break;
                }
            }
            
            ++i;
        }
        
        return i;
    }
}