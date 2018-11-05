package algos.projecteuler;

//Multiples of 3 and 5 = https://projecteuler.net/problem=1
public class Problem1
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        long sum = 0L;
        
        for(int i = 1; i < 1000; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                sum += i;
            }
        }
        
        return sum;
    }
}