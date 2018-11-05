package algos.projecteuler;

import algos.reusable.NumberFactors;
import algos.reusable.TriangleNumber;

//Highly divisible triangular number = https://projecteuler.net/problem=12
public class Problem12
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        int numberOfDivisors = 500;
        int order = Integer.MAX_VALUE;
        
        for(int i = 1; i <= order; i++)
        {
            long triangleNumber = TriangleNumber.getTriangleNumber(i);
            
            if(NumberFactors.getNumberOfFactors(triangleNumber) >= numberOfDivisors)
            {
                return triangleNumber;
            }
        }
        
        return 0;
    }
}