package algos.projecteuler;

import java.math.BigInteger;
import algos.reusable.Factorial;

//Factorial digit sum = https://projecteuler.net/problem=20
public class Problem20
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        BigInteger factorial = Factorial.getFactorial(100);
        long sum = 0;
        
        for(String digit : factorial.toString().split(""))
        {
            sum += Integer.parseInt(digit);
        }
        
        return sum;
    }
}