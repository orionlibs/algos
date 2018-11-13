package algos.projecteuler;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import algos.reusable.PrimeNumber;

//Truncatable primes = https://projecteuler.net/problem=37
public class Problem37
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long sum = 0;
        long numberOfTruncatablePrimes = 0;
        AtomicInteger i = new AtomicInteger(11);
        
        while(numberOfTruncatablePrimes < 11)
        {
            if(PrimeNumber.isPrimeNumber(i.get()))
            {
                if(IntStream.range(1, Integer.toString(i.get()).length())
                            .allMatch(j -> 
                            PrimeNumber.isPrimeNumber(Integer.parseInt(Integer.toString(i.get()).substring(j)))
                            && PrimeNumber.isPrimeNumber(Integer.parseInt(Integer.toString(i.get()).substring(0, j)))))
                {
                    sum += i.get();
                    ++numberOfTruncatablePrimes;
                }
            }
            
            i.incrementAndGet();
        }
        
        return sum;
    }
}