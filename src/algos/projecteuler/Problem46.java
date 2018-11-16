package algos.projecteuler;

import algos.reusable.PrimeNumber;

//Goldbach's other conjecture = https://projecteuler.net/problem=46
public class Problem46
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        for(int i = 1; i < Integer.MAX_VALUE; i = i + 2)
        {
            if(PrimeNumber.isPrimeNumber(i))
            {
                return i;
            }
            else
            {
                for(int j = i - 1; j >= 2; j--)
                {
                    if(PrimeNumber.isPrimeNumber(j))
                    {
                        if((i - j) % 2 == 0)
                        {
                            double temp = (i - j) / 2;
                            
                            if(temp != (int)temp)
                            {
                                return i;
                            }
                            else
                            {
                                double sqrt = Math.sqrt(temp);
                                
                                if(sqrt != (int)sqrt)
                                {
                                    return i;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return 0;
    }
}