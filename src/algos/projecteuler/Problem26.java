package algos.projecteuler;

//Reciprocal cycles = https://projecteuler.net/problem=26
public class Problem26
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        int d = -1;
        int sequenceLength = 0;

        for(int i = 1000; i > 1; i--)
        {
            if(sequenceLength >= i)
            {
                break;
            }

            int[] foundRemainders = new int[i];
            int value = 1;
            int position = 0;

            while(foundRemainders[value] == 0 && value != 0)
            {
                foundRemainders[value] = position;
                value = (value * 10) % i;
                position++;
            }

            if(position - foundRemainders[value] > sequenceLength)
            {
                sequenceLength = position - foundRemainders[value];
                d = i;
            }
        }

        return d;
    }
}