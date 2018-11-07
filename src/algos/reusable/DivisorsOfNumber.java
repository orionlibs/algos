package algos.reusable;

import java.util.ArrayList;
import java.util.List;

public class DivisorsOfNumber
{
    public static List<Integer> getDivisors(long x)
    {
        List<Integer> divisors = new ArrayList<Integer>();
        
        for(int i = 1; i <= (x / 2); i++)
        {
            if(x % i == 0)
            {
                divisors.add(i);
            }
        }
        
        return divisors;
    }
}