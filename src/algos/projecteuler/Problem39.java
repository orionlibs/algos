package algos.projecteuler;

//Integer right triangles = https://projecteuler.net/problem=39
public class Problem39
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long result = 0;
        long maxNumberOfSolutions = 0;
        
        for(long p = 2; p <= 1000; p += 2)
        {
            int numberOfSolutions = 0;
        
            for(long a = 2; a < (p / 3); a++)
            {
                if(p * (p - 2 * a) % (2 * (p - a)) == 0)
                {
                    numberOfSolutions++;
                }
            }
            
            if(numberOfSolutions > maxNumberOfSolutions)
            {
                maxNumberOfSolutions = numberOfSolutions;
                result = p;
            }
        }
        
        return result;
    }
}