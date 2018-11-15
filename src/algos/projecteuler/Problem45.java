package algos.projecteuler;

import algos.reusable.HexagonalNumber;
import algos.reusable.PentagonalNumber;
import algos.reusable.TriangleNumber;

//Triangular, pentagonal, and hexagonal = https://projecteuler.net/problem=45
public class Problem45
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        for(long i = TriangleNumber.getTriangleNumber(285) + 1; i < Integer.MAX_VALUE; i++)
        {
            if(PentagonalNumber.isPentagonalNumber(i) && HexagonalNumber.isHexagonalNumber(i))
            {
                return i;
            }
        }
        
        return 0;
    }
}