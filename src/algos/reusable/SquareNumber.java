package algos.reusable;

public class SquareNumber
{
    public static long getSquareNumber(int order)
    {
        return order * order;
    }
    
    
    public static boolean isSquareNumber(long x)
    {
        long discriminant = 4 * x;
        double squareRootOfDiscriminant = Math.sqrt(discriminant);
        
        if(squareRootOfDiscriminant == (long)squareRootOfDiscriminant)
        {
            double termIndex = squareRootOfDiscriminant / 2;
            
            if(termIndex == (long)termIndex)
            {
                return true;
            }
        }
        
        return false;
    }
}