package algos.projecteuler;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import algos.reusable.PrimeNumber;

//Totient maximum = https://projecteuler.net/problem=69
public class Problem69
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static double solve()
    {
        double max = 0.0;
        
        for(AtomicInteger i = new AtomicInteger(2); i.get() <= 1000000; i.incrementAndGet())
        {
            long numberOfCoprimes = IntStream.range(1, 1000000).filter(j -> PrimeNumber.areRelativePrimeNumbers(i.get(), j)).count();
            double formula = i.get() / numberOfCoprimes;
            
            if(formula > max)
            {
                max = formula;
            }
        }

        return max;
    }
}