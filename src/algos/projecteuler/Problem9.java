package algos.projecteuler;

//Special Pythagorean triplet = https://projecteuler.net/problem=9
public class Problem9
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        for(int i = 1; i < 997; i++)
        {
            for(int j = i + 1; j < 998; j++)
            {
                for(int k = j + 1; k < 999; k++)
                {
                    if(((i * i) + (j * j) == (k * k)) && i + j + k == 1000)
                    {
                        return i * j * k;
                    }
                }
            }
        }
        
        return 0;
    }
}