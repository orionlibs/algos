package algos.reusable;

import java.util.List;

public class SumOfNumbers
{
    public static long getSum(List<Integer> numbers)
    {
        if(numbers.isEmpty())
        {
            return 0;
        }
        else if(numbers.size() == 1)
        {
            return numbers.get(0);
        }
        
        return numbers.stream().reduce((a, b) -> a + b).get();
    }
}