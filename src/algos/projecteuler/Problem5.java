package algos.projecteuler;

import java.util.stream.IntStream;

//Smallest multiple = https://projecteuler.net/problem=5
public class Problem5
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        return IntStream.range(20, Integer.MAX_VALUE)
        .filter(i -> i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i % 7 == 0
                        && i % 8 == 0 && i % 9 == 0 && i % 10 == 0 && i % 11 == 0 && i % 12 == 0
                        && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0
                        && i % 18 == 0 && i % 19 == 0 && i % 20 == 0)
        .findFirst().getAsInt();
    }
}