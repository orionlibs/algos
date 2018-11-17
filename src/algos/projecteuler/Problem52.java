package algos.projecteuler;

import java.util.Arrays;

//Permuted multiples = https://projecteuler.net/problem=52
public class Problem52
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        for(int i = 1; i < Integer.MAX_VALUE; i++)
        {
            char[] temp1Characters = Integer.toString(i).toCharArray();
            char[] temp2Characters = Integer.toString(2 * i).toCharArray();
            char[] temp3Characters = Integer.toString(3 * i).toCharArray();
            char[] temp4Characters = Integer.toString(4 * i).toCharArray();
            char[] temp5Characters = Integer.toString(5 * i).toCharArray();
            char[] temp6Characters = Integer.toString(6 * i).toCharArray();
            Arrays.sort(temp1Characters);
            Arrays.sort(temp2Characters);
            Arrays.sort(temp3Characters);
            Arrays.sort(temp4Characters);
            Arrays.sort(temp5Characters);
            Arrays.sort(temp6Characters);
            
            if(Arrays.equals(temp1Characters, temp2Characters) && Arrays.equals(temp2Characters, temp3Characters)
                            && Arrays.equals(temp3Characters, temp4Characters)
                            && Arrays.equals(temp4Characters, temp5Characters)
                            && Arrays.equals(temp5Characters, temp6Characters))
            {
                return i;
            }
        }
        
        return 0;
    }
}