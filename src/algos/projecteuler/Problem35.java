package algos.projecteuler;

import java.util.List;
import algos.reusable.PrimeNumber;
import algos.reusable.Rotations;

//Circular primes = https://projecteuler.net/problem=35
public class Problem35
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long numberOfCircularPrimes = 0;
        
        for(int i = 1; i < 1000000; i++)
        {
            if(PrimeNumber.isPrimeNumber(i))
            {
                List<String> rotations = Rotations.rotateString(Integer.toString(i));
                
                if(rotations.parallelStream().allMatch(r -> PrimeNumber.isPrimeNumber(Integer.parseInt(r))))
                {
                    ++numberOfCircularPrimes;
                }
            }
        }
        
        return numberOfCircularPrimes;
    }
}