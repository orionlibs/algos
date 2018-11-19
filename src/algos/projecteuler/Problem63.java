package algos.projecteuler;

import java.math.BigDecimal;

//Powerful digit counts = https://projecteuler.net/problem=63
public class Problem63
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long result = 0;
        
        for(int i = 1; i < 999999999; i++)
        {
            int numberLength = Integer.toString(i).length();
            double nthPower = Math.pow(i, 1.0 / numberLength);
            BigDecimal nthPower1 = new BigDecimal(Double.toString(nthPower));
            
            if(nthPower1.pow(numberLength).compareTo(BigDecimal.valueOf(i)) == 0)
            {
                ++result;
            }
        }

        return result;
    }
}