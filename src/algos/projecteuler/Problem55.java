package algos.projecteuler;

import java.math.BigInteger;
import algos.reusable.Strings;

//Lychrel numbers = https://projecteuler.net/problem=55
public class Problem55
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long lychrelNumbers = 0;
        
        for(int i = 101; i < 10000; i++)
        {
            if(i % 10 != 0)
            {
                BigInteger sum = reverseAndAdd(BigInteger.valueOf(i));
                
                for(int iterations = 0; iterations < 49; iterations++)
                {
                    if(Strings.isPalindrome(sum.toString()))
                    {
                        ++lychrelNumbers;
                        break;
                    }
                    else
                    {
                        sum = reverseAndAdd(sum);
                    }
                }
            }
        }
        
        return lychrelNumbers;
    }
    
    
    private static BigInteger reverseAndAdd(BigInteger x)
    {
        return x.add(new BigInteger(new StringBuilder(x.toString()).reverse().toString()));
    }
}