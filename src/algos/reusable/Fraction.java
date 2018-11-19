package algos.reusable;

public class Fraction implements Comparable<Fraction>
{
    private long numerator;
    private long denominator;
    
    
    public Fraction(long numerator, long denominator)
    {
        long gcd = GreatestCommonDivisor.getGCD(numerator, denominator).longValue();
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    
    
    public void addFraction(Fraction fraction)
    {
        long numeratorTemp = (numerator * fraction.getDenominator()) + (fraction.getNumerator() * denominator);
        long denominatorTemp = fraction.getDenominator() * denominator;
        simplifyFraction(numeratorTemp, denominatorTemp);
    }
    
    
    public void subtractFraction(Fraction fraction)
    {
        long numeratorTemp = (numerator * fraction.getDenominator()) - (fraction.getNumerator() * denominator);
        long denominatorTemp = fraction.getDenominator() * denominator;
        simplifyFraction(numeratorTemp, denominatorTemp);
    }
    
    
    public void simplifyFraction()
    {
        long gcd = GreatestCommonDivisor.getGCD(numerator, denominator).longValue();
        numerator /=  gcd;
        denominator /= gcd;
    }
    
    
    public void simplifyFraction(long numeratorTemp, long denominatorTemp)
    {
        long gcd = GreatestCommonDivisor.getGCD(numeratorTemp, denominatorTemp).longValue();
        numerator = numeratorTemp / gcd;
        denominator = denominatorTemp / gcd;
    }
    
    
    public double getValue()
    {
        return (1.0 * numerator) / denominator;
    }


    public long getNumerator()
    {
        return this.numerator;
    }


    public void setNumerator(long numerator)
    {
        this.numerator = numerator;
    }


    public long getDenominator()
    {
        return this.denominator;
    }


    public void setDenominator(long denominator)
    {
        this.denominator = denominator;
    }
    
    
    @Override
    public int hashCode()
    {
        int defaultPrimeNumberForHashing = 31;
        int hash = 3;
        hash = (int)(defaultPrimeNumberForHashing * hash + this.getNumerator());
        hash = (int)(defaultPrimeNumberForHashing * hash + this.getDenominator());
        return hash;
    }


    @Override
    public boolean equals(Object object)
    {
        if(object == null || object.getClass() != getClass())
        {
            return false;
        }
        else
        {
            Fraction otherFraction = (Fraction)object;

            if(this.getNumerator() == otherFraction.getNumerator() && this.getDenominator() == otherFraction.getDenominator())
            {
                return true;
            }
        }

        return false;
    }


    @Override
    public int compareTo(Fraction other)
    {
        if(other == null)
        {
            return -1;
        }
        else if(getValue() < other.getValue())
        {
            return -1;
        }
        else if(getValue() == other.getValue())
        {
            return 0;
        }
        else if(getValue() > other.getValue())
        {
            return 1;
        }
        
        return 0;
    }
}