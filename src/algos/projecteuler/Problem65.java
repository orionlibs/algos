package algos.projecteuler;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

//Convergents of e = https://projecteuler.net/problem=65
public class Problem65
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        BigInteger d = BigInteger.ONE;
        BigInteger n = BigInteger.valueOf(2);
                     
        for(int i = 2; i <= 100; i++)
        {
            BigInteger temp = d;
            BigInteger c = null;
            
            if(i % 3 == 0)
            {
                c = BigInteger.valueOf(2 * (i / 3));
            }
            else
            {
                c = BigInteger.ONE;
            }
            
            d = n;                
            n = (c.multiply(d)).add(temp);
        }

        return getDigitsSum(n);
    }
    
    
    private static int getDigitsSum(BigInteger number)
    {
        char[] k = number.toString().toCharArray();
        AtomicInteger ds = new AtomicInteger(0);
        IntStream.range(0, k.length).forEach(i -> ds.addAndGet(k[i] - '0'));
        return ds.get();
    }
}