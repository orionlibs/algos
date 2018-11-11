package algos.reusable;

import java.util.stream.IntStream;

public class TriangleNumber
{
    public static long getTriangleNumber(int order)
    {
        return IntStream.range(1, order + 1).reduce((i, j) -> i + j).getAsInt();
    }
}