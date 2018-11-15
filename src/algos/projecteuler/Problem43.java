package algos.projecteuler;

import algos.reusable.PandigitalNumber;

//Sub-string divisibility = https://projecteuler.net/problem=43
public class Problem43
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long sum = 0;
        
        for(long i = 1234567890; i <= 9876543210L; i++)
        {
            if(PandigitalNumber.isPandigitalNumber(i))
            {
                String iAsString = Long.toString(i);
                String substring = iAsString.substring(1, 4);
                
                if(Integer.parseInt(substring) % 2 == 0)
                {
                    substring = iAsString.substring(2, 5);
                    
                    if(Integer.parseInt(substring) % 3 == 0)
                    {
                        substring = iAsString.substring(3, 6);
                        
                        if(Integer.parseInt(substring) % 5 == 0)
                        {
                            substring = iAsString.substring(4, 7);
                            
                            if(Integer.parseInt(substring) % 7 == 0)
                            {
                                substring = iAsString.substring(5, 8);
                                
                                if(Integer.parseInt(substring) % 11 == 0)
                                {
                                    substring = iAsString.substring(6, 9);
                                    
                                    if(Integer.parseInt(substring) % 13 == 0)
                                    {
                                        substring = iAsString.substring(7, 10);
                                        
                                        if(Integer.parseInt(substring) % 17 == 0)
                                        {
                                            sum += i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return sum;
    }
}