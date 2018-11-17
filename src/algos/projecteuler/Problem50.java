package algos.projecteuler;

import java.util.List;
import algos.reusable.PrimeNumber;

//Consecutive prime sum = https://projecteuler.net/problem=50
public class Problem50
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        int prime = 0;
        int maxNumberOfConsecutivePrimes = 0;
        List<Integer> primes = PrimeNumber.getPrimeNumbersBelow(1000000);
        
        for(int i = 1000; i < 1000000; i++)
        {
            if(PrimeNumber.isPrimeNumber(i))
            {
                prime = i;
                int sum = 0;
                int numberOfConsecutivePrimes = 0;
                int maxNumberOfConsecutivePrimesTemp = 0;
                
                for(int j = 0; j < primes.size(); j++)
                {
                    sum += primes.get(j);
                    ++numberOfConsecutivePrimes;
                    
                    if(sum == prime)
                    {
                        if(numberOfConsecutivePrimes > maxNumberOfConsecutivePrimesTemp)
                        {
                            maxNumberOfConsecutivePrimesTemp = numberOfConsecutivePrimes;
                        }
                        
                        sum = 0;
                        numberOfConsecutivePrimes = 0;
                        continue;
                    }
                    else if(sum > prime)
                    {
                        sum = 0;
                        numberOfConsecutivePrimes = 0;
                        continue;
                    }
                }
                
                if(maxNumberOfConsecutivePrimesTemp > maxNumberOfConsecutivePrimes)
                {
                    maxNumberOfConsecutivePrimes = maxNumberOfConsecutivePrimesTemp;
                }
            }
        }
        
        return prime;
    }
}