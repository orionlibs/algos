package algos.projecteuler;

import java.util.stream.IntStream;

//Multiples of 3 and 5 = https://projecteuler.net/problem=1
public class Problem1
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        return IntStream.range(1, 1000).filter(i -> i % 3 == 0 || i % 5 == 0).reduce((i, j) -> i + j).getAsInt();
    }
}