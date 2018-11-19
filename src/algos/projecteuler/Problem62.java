package algos.projecteuler;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import algos.reusable.Permutations;

//Cubic permutations = https://projecteuler.net/problem=62
public class Problem62
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        for(int i = 2; i < Integer.MAX_VALUE; i++)
        {
            int numberOfCubedPermutations = 0;
            BigInteger cube = BigInteger.valueOf(i).pow(3);
            List<String> permutations = new Permutations().permuteString(cube.toString())
                            .stream().filter(permutation -> !permutation.startsWith("0"))
                            .collect(Collectors.toList());
            
            for(String permutation : permutations)
            {
                BigInteger temp = new BigInteger(permutation);
                
                if(new BigInteger(Integer.toString((int)Math.pow(temp.doubleValue(), 1.0 / 3))).compareTo(temp) == 0)
                {
                    ++numberOfCubedPermutations;
                    
                    if(numberOfCubedPermutations == 5)
                    {
                        return cube.longValue();
                    }
                }
            }
        }

        return 0;
    }
}