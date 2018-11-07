package algos.projecteuler;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

//Counting Sundays = https://projecteuler.net/problem=19
public class Problem19
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        long numberOfSundays = 0;
        
        for(int i = 1901; i <= 2000; i++)
        {
            for(int j = 1; j <= 12; j++)
            {
                if(LocalDateTime.of(i, j, 1, 0, 0).getDayOfWeek() == DayOfWeek.SUNDAY)
                {
                    ++numberOfSundays;
                }
            }
        }
        
        return numberOfSundays;
    }
}