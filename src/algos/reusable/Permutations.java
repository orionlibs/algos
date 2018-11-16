package algos.reusable;

import java.util.ArrayList;
import java.util.List;

public class Permutations
{
    public static List<String> permuteString(String string) 
    {
        return permuteString(string, 0, string.length() - 1);
    }
    
    
    public static List<String> permuteString(String string, int start, int end) 
    {
        List<String> permutations = new ArrayList<String>();
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
        
        return permutations;
    }
    
    
    private static String swap(String a, int i, int j)
    {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}