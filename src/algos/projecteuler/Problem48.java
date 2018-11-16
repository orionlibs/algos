package algos.projecteuler;

import java.math.BigInteger;

//Self powers = https://projecteuler.net/problem=48
public class Problem48
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static String solve()
    {
        BigInteger sum = BigInteger.ZERO;
        
        for(int i = 1; i <= 1000; i++)
        {
            sum = sum.add(BigInteger.valueOf(i).pow(i));
        }
        
        return sum.toString().substring(sum.toString().length() - 10);
    }
}