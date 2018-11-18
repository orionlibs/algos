package algos.projecteuler;

import algos.reusable.PrimeNumber;

//Spiral primes = https://projecteuler.net/problem=58
public class Problem58
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        int numberOfPrimes = 3;
        int sl = 2;
        int c = 9;

        while(((double)numberOfPrimes) / (2 * sl + 1) > 0.10)
        {
            sl += 2;
            
            for(int i = 0; i < 3; i++)
            {
                c += sl;
                
                if(PrimeNumber.isPrimeNumber(c))
                {
                    numberOfPrimes++;
                }
            }
            
            c += sl;
        }

        return numberOfPrimes;
    }
}