package algos.projecteuler;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

//Powerful digit sum = https://projecteuler.net/problem=56
public class Problem56
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long maxDigitSum = 0;
        
        for(int i = 1; i < 100; i++)
        {
            for(int j = 1; j < 100; j++)
            {
                AtomicLong sum = new AtomicLong(0);
                Arrays.stream(BigInteger.valueOf(i).pow(j).toString().split(""))
                .forEach(digit -> sum.addAndGet(Long.parseLong(digit)));
                
                if(sum.get() > maxDigitSum)
                {
                    maxDigitSum = sum.get();
                }
            }
        }
        
        return maxDigitSum;
    }
}