package algos.reusable;

public class HeptagonalNumber
{
    public static long getHeptagonalNumber(int order)
    {
        return order * ((5 * order) - 3) / 2;
    }
    
    
    public static boolean isHeptagonalNumber(long x)
    {
        long discriminant = 9 + (40 * x);
        double squareRootOfDiscriminant = Math.sqrt(discriminant);
        
        if(squareRootOfDiscriminant == (long)squareRootOfDiscriminant)
        {
            double termIndex = (squareRootOfDiscriminant + 3) / 10;
            
            if(termIndex == (long)termIndex)
            {
                return true;
            }
        }
        
        return false;
    }
}