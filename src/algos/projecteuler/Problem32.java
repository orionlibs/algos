package algos.projecteuler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

//Pandigital products = https://projecteuler.net/problem=32
public class Problem32
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static BigInteger solve()
    {
        BigInteger sum = BigInteger.ZERO;
        Set<BigInteger> products = new HashSet<BigInteger>();
        int iterations = 0;
        
        for(int i = 11110; i < 31427; i++)
        {
            for(int j = 11110; j < 31427; j++)
            {
                ++iterations;
                
                if(iterations % 1000000 == 0)
                {
                    System.out.println(iterations / 1000000);
                }
                
                BigInteger product = BigInteger.valueOf(i).multiply(BigInteger.valueOf(j));
                
                if(!products.contains(product))
                {
                    String allDigits = product.toString() + Integer.toString(i) + Integer.toString(j);
                    
                    if(allDigits.contains("1") && allDigits.contains("2") && allDigits.contains("3")
                                    && allDigits.contains("4") && allDigits.contains("5")
                                    && allDigits.contains("6") && allDigits.contains("7")
                                    && allDigits.contains("8") && allDigits.contains("9"))
                    {
                        sum.add(product);
                    }
                    
                    products.add(product);
                }
            }
        }

        return sum;
    }
}