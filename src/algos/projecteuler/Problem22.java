package algos.projecteuler;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.IOUtils;
import algos.reusable.AlphabeticalValues;

//Names scores = https://projecteuler.net/problem=22
public class Problem22
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    @SuppressWarnings("deprecation")
    private static long solve()
    {
        InputStream namesStream = Problem22.class.getResourceAsStream("Problem22-names.txt");
        List<String> names = new ArrayList<String>();
        long scores = 0;
        
        try
        {
            String namesString = IOUtils.toString(namesStream);
            String[] namesTokens = namesString.split(",");
            
            for(String name : namesTokens)
            {
                names.add(name.replace("\"", ""));
            }
            
            Collections.sort(names);
            int alphabeticalValue = 0;
            
            for(int i = 1; i <= names.size(); i++)
            {
                for(char character : names.get(i - 1).toCharArray())
                {
                    alphabeticalValue += AlphabeticalValues.getAlphabeticalValue(character);
                }
                
                scores += alphabeticalValue * i;
                alphabeticalValue = 0;
            }
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
        
        return scores;
    }
}