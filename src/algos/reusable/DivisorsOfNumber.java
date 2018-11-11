package algos.reusable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class DivisorsOfNumber
{
    public static List<Long> getDivisors(long x)
    {
        List<Long> divisors = new ArrayList<Long>();
        LongStream.range(1, (x / 2) + 1).filter(i -> x % i == 0).forEach(i -> divisors.add(i));
        return divisors;
    }
}