package algos.reusable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations
{
    private Set<String> permutations;
    
    
    public Permutations()
    {
        permutations = new HashSet<String>();
    }
    
    
    public boolean arePermutationsOfEachOther(String s1, String s2)
    {
        char[] s1Characters = s1.toCharArray();
        char[] s2Characters = s2.toCharArray();
        Arrays.sort(s1Characters);
        Arrays.sort(s2Characters);
        return Arrays.equals(s1Characters, s2Characters);
    }
    
    
    public List<String> permuteString(String string) 
    {
        return permuteString(string, 0, string.length() - 1);
    }
    
    
    public List<String> permuteString(String string, int start, int end) 
    {
        String result = string.intern();
        
        if(start != end)
        {
            for(int i = start; i <= end; i++)
            {
                result = swap(result, start, i);
                permuteString(result, start + 1, end);
                result = swap(result, start, i);
            } 
        }
        else
        {
            permutations.add(result);
        }
        
        return new ArrayList<String>(permutations);
    }
    
    
    private String swap(String a, int i, int j)
    {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}