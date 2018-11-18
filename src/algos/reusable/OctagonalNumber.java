package algos.reusable;

public class OctagonalNumber
{
    public static long getOctagonalNumber(int order)
    {
        return order * ((3 * order) - 2);
    }
    
    
    public static boolean isOctagonalNumber(long x)
    {
        long discriminant = 4 + (12 * x);
        double squareRootOfDiscriminant = Math.sqrt(discriminant);
        
        if(squareRootOfDiscriminant == (long)squareRootOfDiscriminant)
        {
            double termIndex = (squareRootOfDiscriminant + 2) / 6;
            
            if(termIndex == (long)termIndex)
            {
                return true;
            }
        }
        
        return false;
    }
}