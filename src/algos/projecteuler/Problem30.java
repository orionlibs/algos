package algos.projecteuler;

//Digit fifth powers = https://projecteuler.net/problem=30
public class Problem30
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long sum = 0;
        
        for(int i = 2; i <= 355000; i++)
        {
            long powerSum = 0;
            
            for(char digit : Integer.toString(i).toCharArray())
            {
                powerSum += (long)Math.pow(Long.parseLong(String.valueOf(digit)), 5);
            }
            
            sum = (powerSum == i) ? sum + i : sum;
        }
        
        return sum;
    }
}