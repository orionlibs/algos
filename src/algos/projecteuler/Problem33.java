package algos.projecteuler;

import algos.reusable.GreatestCommonDivisor;

//Digit cancelling fractions = https://projecteuler.net/problem=33
public class Problem33
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        int denominatorsProduct = 1;
        int numeratorProduct = 1;

        for(int i = 1; i < 10; i++)
        {
            for(int denominator = 1; denominator < i; denominator++)
            {
                for(int numerator = 1; numerator < denominator; numerator++)
                {
                    if((numerator * 10 + i) * denominator == numerator * (i * 10 + denominator))
                    {
                        denominatorsProduct *= denominator;
                        numeratorProduct *= numerator;
                    }
                }
            }
        }
        
        return denominatorsProduct / GreatestCommonDivisor.getGCDAsLong(numeratorProduct, denominatorsProduct);
    }
}