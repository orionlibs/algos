package algos.projecteuler;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import algos.reusable.Factorial;

//Digit factorials = https://projecteuler.net/problem=34
public class Problem34
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static BigInteger solve()
    {
        BigInteger sum = BigInteger.ZERO;
        
        for(int i = 3; i < 100000; i++)
        {
            String[] digits = Integer.toString(i).split("");
            AtomicInteger digitFactorialSum = new AtomicInteger(0);
            Arrays.stream(digits).forEach(d -> digitFactorialSum.addAndGet(Factorial.getFactorial(Integer.parseInt(d)).intValue()));
            
            if(digitFactorialSum.intValue() == i)
            {
                sum = sum.add(BigInteger.valueOf(i));
            }
        }
        
        return sum;
    }
}