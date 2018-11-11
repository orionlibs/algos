package algos.projecteuler;

import java.util.ArrayList;
import java.util.List;
import algos.reusable.DivisorsOfNumber;
import algos.reusable.SumOfNumbers;

//Non-abundant sums = https://projecteuler.net/problem=23
public class Problem23
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        long sum = 0;
        List<Integer> abundantNumbers = new ArrayList<Integer>();
        
        for(int i = 2; i <= 28123; i++)
        {
            List<Long> divisors = DivisorsOfNumber.getDivisors(i);
            long sumOfDivisors = SumOfNumbers.getSum(divisors);
            
            if(sumOfDivisors > i)
            {
                abundantNumbers.add(i);
            }
        }
        
        for(int i = 1; i <= 28123; i++)
        {
            boolean found = false;
            
            loop1 : for(int j = 0; j < abundantNumbers.size() - 1; j++)
            {
                for(int k = j; k < abundantNumbers.size(); k++)
                {
                    if(i == abundantNumbers.get(j) + abundantNumbers.get(k))
                    {
                        found = true;
                        break loop1;
                    }
                }
            }
            
            if(!found)
            {
                sum += i;
            }
        }
        
        return sum;
    }
}