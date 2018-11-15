package algos.reusable;

public class PentagonalNumber
{
    public static long getPentagonalNumber(int order)
    {
        return (order * ((3 * order) - 1)) / 2;
    }
    
    
    public static boolean isPentagonalNumber(long x)
    {
        long discriminant = 1 + (24 * x);
        double squareRootOfDiscriminant = Math.sqrt(discriminant);
        
        if(squareRootOfDiscriminant == (long)squareRootOfDiscriminant)
        {
            double termIndex = (squareRootOfDiscriminant + 1) / 6;
            
            if(termIndex == (long)termIndex)
            {
                return true;
            }
        }
        
        return false;
    }
}