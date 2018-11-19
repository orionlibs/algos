package algos.projecteuler;

//Odd period square roots = https://projecteuler.net/problem=64
public class Problem64
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        int result = 0;

        for(int n = 2; n <= 10000; n++)
        {
            int limit = (int)Math.sqrt(n);                                
            
            if(limit * limit == n)
            {
                continue;
            }
            
            int period = 0;
            int d = 1;
            int m = 0;
            int a = limit;

            do
            {                
                m = (d * a) - m;                    
                d = (n - m * m) / d;
                a = (limit + m) / d;
                period++;
            }
            while(a != 2 * limit);
            
            if(period % 2 == 1) 
            {
                result++;
            }
        }

        return result;
    }
}