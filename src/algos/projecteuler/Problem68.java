package algos.projecteuler;

//Magic 5-gon ring = https://projecteuler.net/problem=68
public class Problem68
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static String solve()
    {
        int[] p = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String result = "";
        
        while(true)
        {
            if(!getNextPerm(p))
            {
                break;
            }
            
            if(checkResult(p))
            {
                String candidate = "" + p[0] + p[1] + p[2] + p[3] + p[2] + p[4] + p[5] + p[4] + p[6] + p[7] + p[6] + p[8] + p[9] + p[8] + p[1];
                
                if(candidate.compareTo(result) > 0)
                {
                    result = candidate;
                }
            }                 
        }

        return result;
    }
    
    
    private static boolean getNextPerm(int[] p)
    {
        int N = p.length;
        int i = N - 1;

        while(p[i - 1] >= p[i])
        {
            i--;
            
            if(i < 1)
            {
                return false;
            }
        }

        int j = N;
        
        while(p[j - 1] <= p[i - 1])
        {
            j = j - 1;
        }

        // swap values at position i-1 and j-1
        swap(i - 1, j - 1, p);
        i++;
        j = N;

        while(i < j)
        {
            swap(i - 1, j - 1, p);
            i++;
            j--;
        }
        
        return true;
    }
    
    
    private static void swap(int i, int j, int[] p)
    {
        int k = p[i];
        p[i] = p[j];
        p[j] = k;
    }
    
    
    private static boolean checkResult(int[] p)
    {   
        if(p[1] == 10 ||
            p[2] == 10 ||
            p[4] == 10 ||
            p[6] == 10 ||
            p[8] == 10)
        {
            return false;
        }
        
        if(p[0] > p[3] ||
            p[0] > p[5] ||
            p[0] > p[7] ||
            p[0] > p[9] )
        {
            return false;
        }

        if(p[0] + p[1] + p[2] != p[3] + p[2] + p[4])
        {
            return false;
        }
        
        if(p[0] + p[1] + p[2] != p[5] + p[4] + p[6])
        {
            return false;
        }
        
        if(p[0] + p[1] + p[2] != p[7] + p[6] + p[8])
        {
            return false;
        }
        
        if(p[0] + p[1] + p[2] != p[9] + p[8] + p[1])
        {
            return false;
        }
        
        return true;
    }
}