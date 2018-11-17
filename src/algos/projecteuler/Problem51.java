package algos.projecteuler;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import algos.reusable.PrimeNumber;

// Prime digit replacements = https://projecteuler.net/problem=51
public class Problem51
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        long smallestPrime = Integer.MAX_VALUE;
        int[][] fiveDigitPattern = get5digitPatterns();
        int[][] sixDigitPattern = get6digitPatterns();

        for(int i = 11; i < 1000; i += 2)
        {
            if(i % 5 == 0)
            {
                continue;
            }

            int[][] patterns = (i < 100) ? fiveDigitPattern : sixDigitPattern;

            for(int j = 0; j < patterns.length; j++)
            {
                for(int k = 0; k <= 2; k++)
                {
                    if(patterns[j][0] == 0 && k == 0)
                    {
                        continue;
                    }

                    int[] pattern = fillPattern(patterns[j], i);
                    int candidate = generateNumber(k, pattern);

                    if(candidate < smallestPrime && PrimeNumber.isPrimeNumber(candidate))
                    {
                        if(familySize(k, pattern) == 8)
                        {
                            smallestPrime = candidate;
                        }

                        break;
                    }
                }
            }
        }

        return smallestPrime;
    }


    private static int[][] get5digitPatterns()
    {
        int[][] retVal = new int[4][];
        retVal[0] = new int[]{1, 0, 0, 0, 1};
        retVal[1] = new int[]{0, 1, 0, 0, 1};
        retVal[2] = new int[]{0, 0, 1, 0, 1};
        retVal[3] = new int[]{0, 0, 0, 1, 1};
        return retVal;
    }


    private static int[][] get6digitPatterns()
    {
        int[][] retVal = new int[10][];
        retVal[0] = new int[]{1, 1, 0, 0, 0, 1};
        retVal[1] = new int[]{1, 0, 1, 0, 0, 1};
        retVal[2] = new int[]{1, 0, 0, 1, 0, 1};
        retVal[3] = new int[]{1, 0, 0, 0, 1, 1};
        retVal[4] = new int[]{0, 1, 1, 0, 0, 1};
        retVal[5] = new int[]{0, 1, 0, 1, 0, 1};
        retVal[6] = new int[]{0, 1, 0, 0, 1, 1};
        retVal[7] = new int[]{0, 0, 1, 1, 0, 1};
        retVal[8] = new int[]{0, 0, 1, 0, 1, 1};
        retVal[9] = new int[]{0, 0, 0, 1, 1, 1};
        return retVal;
    }


    private static int[] fillPattern(int[] pattern, int number)
    {
        int[] filledPattern = new int[pattern.length];
        int temp = number;

        for(int i = filledPattern.length - 1; i >= 0; i--)
        {
            if(pattern[i] == 1)
            {
                filledPattern[i] = temp % 10;
                temp /= 10;
            }
            else
            {
                filledPattern[i] = -1;
            }
        }
        
        return filledPattern;
    }


    private static int generateNumber(int repNumber, int[] filledPattern)
    {
        int temp = 0;
        
        for(int i = 0; i < filledPattern.length; i++)
        {
            if(filledPattern[i] == -1)
            {
                temp = (temp * 10) + repNumber;
            }
            else
            {
                temp = (temp * 10) + filledPattern[i];
            }
        }
        
        return temp;
    }


    private static int familySize(int repeatingNumber, int[] pattern)
    {
        AtomicInteger familySize = new AtomicInteger(1);
        IntStream.range(repeatingNumber + 1, 10)
        .filter(i -> PrimeNumber.isPrimeNumber(generateNumber(i, pattern)))
        .forEach(i -> familySize.incrementAndGet());
        return familySize.get();
    }
}