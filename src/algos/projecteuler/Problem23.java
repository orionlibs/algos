package algos.projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
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
        IntStream.range(2, 28124)
        .filter(i -> SumOfNumbers.getSum(DivisorsOfNumber.getDivisors(i)) > i)
        .forEach(i -> abundantNumbers.add(i));
        
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
            
            sum = (!found) ? sum + i : sum;
        }
        
        return sum;
    }
}