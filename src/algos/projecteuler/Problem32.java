package algos.projecteuler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import algos.reusable.PandigitalNumber;

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
        
        for(int i = 11110; i < 31427; i++)
        {
            for(int j = 11110; j < 31427; j++)
            {
                BigInteger product = BigInteger.valueOf(i).multiply(BigInteger.valueOf(j));
                
                if(!products.contains(product))
                {
                    String allDigits = product.toString() + Integer.toString(i) + Integer.toString(j);
                    
                    if(PandigitalNumber.isPandigitalNumber(allDigits))
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