package algos.projecteuler;

//Sum square difference = https://projecteuler.net/problem=6
public class Problem6
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        long sum = 0L;
        long sumOfSquares = 0L;
        
        for(int i = 1; i <= 100; i++)
        {
            sum += i;
            sumOfSquares += i * i;
        }
        
        return (sum * sum) - sumOfSquares;
    }
}