package algos.projecteuler;

import algos.reusable.PandigitalNumber;
import algos.reusable.PrimeNumber;

//Pandigital prime = https://projecteuler.net/problem=41
public class Problem41
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long largestPandigitalPrime = 0;
        
        for(int i = 1; i <= 987654321; i++)
        {
            if(PrimeNumber.isPrimeNumber(i) && PandigitalNumber.isPandigitalNumber(i) && i > largestPandigitalPrime)
            {
                largestPandigitalPrime = i;
            }
        }
        
        return largestPandigitalPrime;
    }
}