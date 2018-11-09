package algos.projecteuler;

//Number spiral diagonals = https://projecteuler.net/problem=28
public class Problem28
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        return (1001 * (1001 * (4 * 1001 + 3) + 8) - 9) / 6;
    }
}