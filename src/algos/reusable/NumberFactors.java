package algos.reusable;

public class NumberFactors
{
    public static int getNumberOfFactors(long x)
    {
        int numberOfFactors = 0;
        
        for(long i = 1; i <= x; i++)
        {
            if(x % i == 0)
            {
                ++numberOfFactors;
            }
        }
        
        return numberOfFactors;
    }
}