package algos.projecteuler;

//Largest palindrome product = https://projecteuler.net/problem=4
public class Problem4
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static int solve()
    {
        int largestPalindrome = 0;
        
        for(int i = 100; i <= 999; i++)
        {
            for(int j = 100; j <= 999; j++)
            {
                int x = i * j;
                
                if(Integer.toString(x).equals(new StringBuilder(Integer.toString(x)).reverse().toString()) && x > largestPalindrome)
                {
                    largestPalindrome = x;
                }
            }
        }
        
        return largestPalindrome;
    }
}