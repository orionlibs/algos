package algos.projecteuler;

import java.util.Collections;
import java.util.List;
import algos.reusable.Permutations;
import algos.reusable.PrimeNumber;

//Prime permutations = https://projecteuler.net/problem=49
public class Problem49
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        for(int i = 1000; i <= 9999; i++)
        {
            if(i != 1487)
            {
                if(PrimeNumber.isPrimeNumber(i))
                {
                    List<String> permutations = Permutations.permuteString(Integer.toString(i));
                    Collections.sort(permutations);
                    
                    for(String permutation : permutations)
                    {
                        System.out.println(permutation);
                    }
                }
            }
        }
        
        return 0;
    }
}