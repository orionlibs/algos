package algos.projecteuler;

import algos.reusable.PentagonalNumber;

//Pentagon numbers = https://projecteuler.net/problem=44
public class Problem44
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long minimum = Integer.MAX_VALUE;
        
        for(int i = 1; i <= 10000000; i++)
        {
            if(PentagonalNumber.isPentagonalNumber(i))
            {
                for(int j = i + 1; j < 10000000; j++)
                {
                    if(PentagonalNumber.isPentagonalNumber(j) && PentagonalNumber.isPentagonalNumber(i + j)
                                    && PentagonalNumber.isPentagonalNumber(Math.abs(i - j)) && Math.abs(i - j) < minimum)
                    {
                        minimum = Math.abs(i - j);
                    }
                }
            }
        }
        
        return minimum;
    }
}