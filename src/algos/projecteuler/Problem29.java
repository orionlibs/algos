package algos.projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

//Distinct powers = https://projecteuler.net/problem=29
public class Problem29
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        Set<BigInteger> numbers = new HashSet<BigInteger>();
        IntStream.range(2, 101)
        .forEach(i -> IntStream.range(2, 101).forEach(j -> numbers.add(BigInteger.valueOf(i).pow(j))));
        return new ArrayList<BigInteger>(numbers).size();
    }
}