package algos.projecteuler;

import java.util.stream.IntStream;
import algos.reusable.Strings;

//Double-base palindromes = https://projecteuler.net/problem=36
public class Problem36
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        return IntStream.range(1, 1000000)
                        .filter(i -> Strings.isPalindrome(Integer.toString(i)) && Strings.isPalindrome(Integer.toBinaryString(i)))
                        .reduce((i, j) -> i + j).getAsInt();
    }
}