package algos.projecteuler;

import java.math.BigInteger;

//Diophantine equation = https://projecteuler.net/problem=66
public class Problem66
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        int result = 0;
        BigInteger pmax = BigInteger.ZERO;

        for(int d = 2; d <= 1000; d++)
        {
            BigInteger limit = BigInteger.valueOf((int)Math.sqrt(d));
            
            if(limit.pow(2).compareTo(BigInteger.valueOf(d)) == 0)
            {
                continue;
            }

            BigInteger m = BigInteger.ZERO;
            BigInteger d1 = BigInteger.ONE;
            BigInteger a = limit;
            BigInteger numm1 = BigInteger.ONE;
            BigInteger num = a;
            BigInteger denm1 = BigInteger.ZERO;
            BigInteger den = BigInteger.ONE;

            while(num.pow(2).subtract(BigInteger.valueOf(d).multiply(den.pow(2))).compareTo(BigInteger.ONE) != 0)
            {
                m = d1.multiply(a).subtract(m);
                d = BigInteger.valueOf(d).subtract(m.pow(2)).divide(d1).intValue();
                a = limit.add(m).divide(d1);
                BigInteger numm2 = numm1;
                numm1 = num;
                BigInteger denm2 = denm1;
                denm1 = den;
                num = a.multiply(numm1).add(numm2);
                den = a.multiply(denm1).add(denm2);
            }

            if(num.compareTo(pmax) == 1)
            {
                pmax = num;
                result = d;
            }
        }

        return result;
    }
}