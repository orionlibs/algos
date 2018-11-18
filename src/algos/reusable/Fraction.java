package algos.reusable;

public class Fraction
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
}