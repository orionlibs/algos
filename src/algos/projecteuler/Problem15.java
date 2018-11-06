package algos.projecteuler;

//Lattice paths = https://projecteuler.net/problem=15
public class Problem15
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        int gridSize = 20;
        long numberOfRoutes = 1;
         
        for(int i = 0; i < gridSize; i++)
        {
            numberOfRoutes *= (2 * gridSize) - i;
            numberOfRoutes /= i + 1;
        }
        
        return numberOfRoutes;
    }
}