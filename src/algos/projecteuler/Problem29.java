package algos.projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Distinct powers = https://projecteuler.net/problem=29
public class Problem29
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        Set<BigInteger> numbers = new HashSet<BigInteger>();
        
        for(int i = 2; i <= 100; i++)
        {
            for(int j = 2; j <= 100; j++)
            {
                numbers.add(BigInteger.valueOf(i).pow(j));
            }
        }
        
        List<BigInteger> numbersUnique = new ArrayList<BigInteger>(numbers);
        Collections.sort(new ArrayList<BigInteger>(numbers));
        return numbersUnique.size();
    }
}