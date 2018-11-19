package algos.projecteuler;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import algos.reusable.Permutations;
import algos.reusable.PrimeNumber;

//Totient permutation = https://projecteuler.net/problem=70
public class Problem70
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        double max = Double.MAX_VALUE;
        long minimumI = 0;
        
        for(AtomicInteger i = new AtomicInteger(2); i.get() < 10000000; i.incrementAndGet())
        {
            long numberOfCoprimes = IntStream.range(1, 9999999).filter(j -> PrimeNumber.areRelativePrimeNumbers(i.get(), j)).count();
            
            if(new Permutations().arePermutationsOfEachOther(i.toString(), Long.toString(numberOfCoprimes)))
            {
                double formula = i.get() / numberOfCoprimes;
                
                if(formula < max)
                {
                    max = formula;
                    minimumI = i.get();
                }
            }
        }

        return minimumI;
    }
}