package algos.projecteuler;

import java.math.BigInteger;

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
                
                if(digits.length() == 9 && digits.contains("1") && digits.contains("2") && digits.contains("3")
                                && digits.contains("4") && digits.contains("5") && digits.contains("6")
                                && digits.contains("7") && digits.contains("8") && digits.contains("9")
                                && i > largestPandigital)
                {
                    largestPandigital = Long.parseLong(digits);
                }
            }
        }
        
        return largestPandigital;
    }
}