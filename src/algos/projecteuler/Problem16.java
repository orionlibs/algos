package algos.projecteuler;

import java.math.BigInteger;

//Power digit sum = https://projecteuler.net/problem=16
public class Problem16
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        long sum = 0;
        BigInteger two = BigInteger.valueOf(2);
        String resultString = two.pow(1000).toString();
        
        for(int i = 0; i < resultString.length(); i++)
        {
            sum += Long.parseLong(Character.toString(resultString.charAt(i)));
        }
        
        return sum;
    }
}