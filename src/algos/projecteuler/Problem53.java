package algos.projecteuler;

import java.math.BigInteger;
import algos.reusable.Combinations;

//Combinatoric selections = https://projecteuler.net/problem=53
public class Problem53
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long result = 0;
        
        for(int n = 1; n <= 100; n++)
        {
            for(int r = 1; r <= n; r++)
            {
                if(Combinations.getNumberOfCombinations(n, r).compareTo(BigInteger.valueOf(1000000)) == 1)
                {
                    ++result;
                }
            }
        }
        
        return result;
    }
}