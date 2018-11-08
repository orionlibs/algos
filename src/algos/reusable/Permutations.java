package algos.reusable;

import java.util.ArrayList;
import java.util.List;

public class Permutations
{
    private List<String> permutations;
    
    
    public Permutations()
    {
        this.permutations = new ArrayList<String>();
    }
    
    
    public String permuteString(String string, int start, int end) 
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
        
        return result;
    }
    
    
    public String swap(String a, int i, int j)
    {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


    public List<String> getPermutations()
    {
        return this.permutations;
    }


    public void setPermutations(List<String> permutations)
    {
        this.permutations = permutations;
    }
}