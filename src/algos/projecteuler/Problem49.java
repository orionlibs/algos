package algos.projecteuler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import algos.reusable.Permutations;
import algos.reusable.PrimeNumber;

//Prime permutations = https://projecteuler.net/problem=49
public class Problem49
{
    //TODO: not finished
    
    
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        for(int i = 1000; i <= 9999; i++)
        {
            if(i == 1487)
            {
                if(PrimeNumber.isPrimeNumber(i))
                {
                    List<String> permutations = new Permutations().permuteString(Integer.toString(i));
                    AtomicInteger temp = new AtomicInteger(i);
                    permutations = permutations.stream()
                                    .filter(permutation -> !permutation.startsWith("0")
                                                    && permutation.compareTo(temp.toString()) >= 0)
                                    .collect(Collectors.toList());
                    Collections.sort(permutations);
                    Map<String, Integer> pairAndDifferenceMapper = new HashMap<String, Integer>();
                    int previousPrime = i;
                    
                    for(int j = 1; j < permutations.size(); j++)
                    {
                        if(PrimeNumber.isPrimeNumber(Integer.parseInt(permutations.get(j))))
                        {
                            pairAndDifferenceMapper.put(Integer.toString(previousPrime) + "-" + permutations.get(j), Integer.parseInt(permutations.get(j)) - previousPrime);
                            previousPrime = Integer.parseInt(permutations.get(j));
                        }
                    }
                    
                    System.out.println(pairAndDifferenceMapper);
                }
            }
        }
        
        return 0;
    }
}