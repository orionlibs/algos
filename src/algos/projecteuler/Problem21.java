package algos.projecteuler;

import java.util.List;
import algos.reusable.DivisorsOfNumber;
import algos.reusable.SumOfNumbers;

//Amicable numbers = https://projecteuler.net/problem=21
public class Problem21
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        long sumOfAmicableNumbers = 0;
        
        for(int i = 2; i < 10000; i++)
        {
            List<Long> divisorsOfI = DivisorsOfNumber.getDivisors(i);
            long sumOfDivisorsOfI = SumOfNumbers.getSum(divisorsOfI);
            
            if(sumOfDivisorsOfI > i && sumOfDivisorsOfI < 10000)
            {
                List<Long> divisorsOfSumOfDivisorsOfI = DivisorsOfNumber.getDivisors(sumOfDivisorsOfI);
                long sumOfDivisorsOfSumOfDivisorsOfI = SumOfNumbers.getSum(divisorsOfSumOfDivisorsOfI);
                
                if(i == sumOfDivisorsOfSumOfDivisorsOfI)
                {
                    sumOfAmicableNumbers += i + sumOfDivisorsOfI;
                }
            }
        }
        
        return sumOfAmicableNumbers;
    }
}