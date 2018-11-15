package algos.reusable;

public class TriangleNumber
{
    public static long getTriangleNumber(int order)
    {
        return (order * (order + 1)) / 2;
    }
    
    
    public static boolean isTriangleNumber(long x)
    {
        long discriminant = 1 + (8 * x);
        double squareRootOfDiscriminant = Math.sqrt(discriminant);
        
        if(squareRootOfDiscriminant == (long)squareRootOfDiscriminant)
        {
            double termIndex = (squareRootOfDiscriminant - 1) / 2;
            
            if(termIndex == (long)termIndex)
            {
                return true;
            }
        }
        
        return false;
    }
}