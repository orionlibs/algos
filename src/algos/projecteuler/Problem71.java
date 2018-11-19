package algos.projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import algos.reusable.Fraction;
import algos.reusable.NumberFactors;

//Ordered fractions = https://projecteuler.net/problem=71
public class Problem71
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        Set<Fraction> reducedProperFractions = new HashSet<Fraction>();
        
        for(AtomicInteger d = new AtomicInteger(2); d.get() <= 10000000; d.incrementAndGet())
        {
            IntStream.range(1, 10000000)
            .filter(n -> NumberFactors.getHighestCommonFactor(n, d.get()) == 1)
            .forEach(n -> reducedProperFractions.add(new Fraction(n, d.get())));
        }
        
        List<Fraction> reducedProperFractions1 = new ArrayList<Fraction>(reducedProperFractions);
        Collections.sort(reducedProperFractions1);
        
        for(int i = 0; i < reducedProperFractions1.size(); i++)
        {
            if(reducedProperFractions1.get(i).getNumerator() == 3
                            && reducedProperFractions1.get(i).getDenominator() == 7)
            {
                return reducedProperFractions1.get(i - 1).getNumerator();
            }
        }

        return 0;
    }
}