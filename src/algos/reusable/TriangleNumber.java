package algos.reusable;

public class TriangleNumber
{
    public static long getTriangleNumber(int order)
    {
        long triangleNumber = 0;
        
        for(int i = 1; i <= order; i++)
        {
            triangleNumber += i;
        }
        
        return triangleNumber;
    }
}