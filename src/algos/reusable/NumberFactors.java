package algos.reusable;

import java.util.stream.LongStream;

public class NumberFactors
{
    public static long getNumberOfFactors(long x)
    {
        return LongStream.range(1, x + 1).filter(i -> x % i == 0).count();
    }
}