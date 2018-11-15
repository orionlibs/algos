package algos.projecteuler;

import java.math.BigInteger;
import algos.reusable.PandigitalNumber;

//Pandigital multiples = https://projecteuler.net/problem=38
public class Problem38
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long largestPandigital = 0;
        
        for(long i = 1; i <= 99999; i++)
        {
            String digits = "";
            
            for(long j = 1; j <= 50; j++)
            {
                digits += BigInteger.valueOf(i).multiply(BigInteger.valueOf(j)).toString();
                
                if(PandigitalNumber.isPandigitalNumber(digits) && i > largestPandigital)
                {
                    largestPandigital = Long.parseLong(digits);
                }
            }
        }
        
        return largestPandigital;
    }
}