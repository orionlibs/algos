package algos.reusable;

import java.math.BigInteger;

public class PandigitalNumber
{
    public static boolean isPandigitalNumber(String x)
    {
        if(x.isEmpty() || x.length() > 10)
        {
            return false;
        }
        else
        {
            if(x.length() == 1 && x.contains("1"))
            {
                return true;
            }
            else if(x.length() == 2 && x.contains("1") && x.contains("2"))
            {
                return true;
            }
            else if(x.length() == 3 && x.contains("1") && x.contains("2")
                            && x.contains("3"))
            {
                return true;
            }
            else if(x.length() == 4 && x.contains("1") && x.contains("2")
                            && x.contains("3") && x.contains("4"))
            {
                return true;
            }
            else if(x.length() == 5 && x.contains("1") && x.contains("2")
                            && x.contains("3") && x.contains("4")
                            && x.contains("5"))
            {
                return true;
            }
            else if(x.length() == 6 && x.contains("1") && x.contains("2")
                            && x.contains("3") && x.contains("4")
                            && x.contains("5") && x.contains("6"))
            {
                return true;
            }
            else if(x.length() == 7 && x.contains("1") && x.contains("2")
                            && x.contains("3") && x.contains("4")
                            && x.contains("5") && x.contains("6")
                            && x.contains("7"))
            {
                return true;
            }
            else if(x.length() == 8 && x.contains("1") && x.contains("2")
                            && x.contains("3") && x.contains("4")
                            && x.contains("5") && x.contains("6")
                            && x.contains("7") && x.contains("8"))
            {
                return true;
            }
            else if(x.length() == 9 && x.contains("1") && x.contains("2")
                            && x.contains("3") && x.contains("4")
                            && x.contains("5") && x.contains("6")
                            && x.contains("7") && x.contains("8")
                            && x.contains("9"))
            {
                return true;
            }
            else if(x.length() == 10 && x.contains("1") && x.contains("2")
                            && x.contains("3") && x.contains("4")
                            && x.contains("5") && x.contains("6")
                            && x.contains("7") && x.contains("8")
                            && x.contains("9") && x.contains("0"))
            {
                return true;
            }
        }
        
        return false;
    }
    
    
    public static boolean isPandigitalNumber(BigInteger x)
    {
        return isPandigitalNumber(x.toString());
    }
    
    
    public static boolean isPandigitalNumber(long x)
    {
        return isPandigitalNumber(Long.toString(x));
    }
}