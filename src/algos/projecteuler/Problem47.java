package algos.projecteuler;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import algos.reusable.NumberFactors;

//Distinct primes factors = https://projecteuler.net/problem=47
public class Problem47
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        for(long i = 2 * 3 * 5 * 7; i < Long.MAX_VALUE - 3; i++)
        {
            System.out.println(i);
            List<Long> factors1 = NumberFactors.getPrimeFactors(i);
            List<Long> factors2 = NumberFactors.getPrimeFactors(i + 1);
            List<Long> factors3 = NumberFactors.getPrimeFactors(i + 2);
            List<Long> factors4 = NumberFactors.getPrimeFactors(i + 3);
            Set<Long> temp = new HashSet<Long>();
            temp.addAll(factors1);
            temp.addAll(factors2);
            temp.addAll(factors3);
            temp.addAll(factors4);
            
            if(temp.size() == factors1.size() + factors2.size() + factors3.size() + factors4.size())
            {
                return i;
            }
        }
        
        return 0;
    }
}