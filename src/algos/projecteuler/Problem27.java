package algos.projecteuler;

import java.math.BigInteger;
import algos.reusable.PrimeNumber;

//Quadratic primes = https://projecteuler.net/problem=27
public class Problem27
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long productOfCoefficients = 0;
        long maxNumberOfPrimesFound = 0;
        
        for(int i = -1000; i <= 1000; i++)
        {
            for(int j = -1000; j <= 1000; j++)
            {
                int n = 0;
                long numberOfPrimesFoundByFormula = 0;
                
                while(true)
                {
                    long formula = (n * n) + (i * n) + j;
                    
                    if(PrimeNumber.isPrimeNumber(formula))
                    {
                        ++numberOfPrimesFoundByFormula;
                        ++n;
                    }
                    else
                    {
                        break;
                    }
                }
                
                if(numberOfPrimesFoundByFormula > maxNumberOfPrimesFound)
                {
                    maxNumberOfPrimesFound = numberOfPrimesFoundByFormula;
                    productOfCoefficients = i * j;
                }
            }
        }

        return productOfCoefficients;
    }
}