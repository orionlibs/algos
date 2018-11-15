package algos.projecteuler;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.IOUtils;
import algos.reusable.AlphabeticalValues;
import algos.reusable.TriangleNumber;

//Coded triangle numbers = https://projecteuler.net/problem=42
public class Problem42
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    @SuppressWarnings("deprecation")
    private static long solve()
    {
        long numberOfTriangleWords = 0;
        InputStream wordsStream = Problem22.class.getResourceAsStream("Problem42-words.txt");
        List<String> words = new ArrayList<String>();
        
        try
        {
            String wordsString = IOUtils.toString(wordsStream);
            Arrays.stream(wordsString.split(",")).forEach(word -> words.add(word.replace("\"", "")));
            int alphabeticalValue = 0;
            
            for(int i = 1; i <= words.size(); i++)
            {
                for(char character : words.get(i - 1).toCharArray())
                {
                    alphabeticalValue += AlphabeticalValues.getAlphabeticalValue(character);
                }
                
                if(TriangleNumber.isTriangleNumber(alphabeticalValue))
                {
                    ++numberOfTriangleWords;
                }
                
                alphabeticalValue = 0;
            }
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
        
        return numberOfTriangleWords;
    }
}