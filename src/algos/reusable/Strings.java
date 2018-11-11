package algos.reusable;

public class Strings
{
    public static boolean arePalindromes(String s1, String s2)
    {
        return s1.equals(new StringBuilder(s2).reverse().toString());
    }
}