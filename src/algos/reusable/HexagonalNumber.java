package algos.reusable;

public class HexagonalNumber
{
    public static long getHexagonalNumber(int order)
    {
        return order * ((2 * order) - 1);
    }
    
    
    public static boolean isHexagonalNumber(long x)
    {
        long discriminant = 1 + (8 * x);
        double squareRootOfDiscriminant = Math.sqrt(discriminant);
        
        if(squareRootOfDiscriminant == (long)squareRootOfDiscriminant)
        {
            double termIndex = (squareRootOfDiscriminant + 1) / 4;
            
            if(termIndex == (long)termIndex)
            {
                return true;
            }
        }
        
        return false;
    }
}