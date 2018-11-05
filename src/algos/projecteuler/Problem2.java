package algos.projecteuler;

import java.util.ArrayList;
import java.util.List;

//Even Fibonacci numbers = https://projecteuler.net/problem=2
public class Problem2
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        long sum = 2L;
        List<Integer> terms = new ArrayList<Integer>();
        terms.add(1);
        terms.add(2);
        int currentTerm = 0;
        
        for(int i = 2; i < Integer.MAX_VALUE; i++)
        {
            currentTerm = terms.get(i - 1) + terms.get(i - 2);
            
            if(currentTerm <= 4000000)
            {
                terms.add(currentTerm);
                
                if(currentTerm % 2 == 0)
                {
                    sum += currentTerm;
                }
            }
            else
            {
                break;
            }
        }
        
        return sum;
    }
}