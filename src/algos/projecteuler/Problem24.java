package algos.projecteuler;

import java.util.Collections;
import java.util.List;
import algos.reusable.Permutations;

//Lexicographic permutations = https://projecteuler.net/problem=24
public class Problem24
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static String solve()
    {
        String string = "0123456789";
        List<String> permutations = Permutations.permuteString(string, 0, string.length() - 1);
        Collections.sort(permutations);
        return permutations.get(1000000);
    }
}