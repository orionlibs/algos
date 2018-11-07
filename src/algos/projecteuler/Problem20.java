package algos.projecteuler;

import java.math.BigInteger;

//Factorial digit sum = https://projecteuler.net/problem=20
public class Problem20
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        BigInteger factorial = BigInteger.ONE;
        long sum = 0;
        
        for(int i = 100; i > 1; i--)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        for(String digit : factorial.toString().split(""))
        {
            sum += Integer.parseInt(digit);
        }
        
        return sum;
    }
}