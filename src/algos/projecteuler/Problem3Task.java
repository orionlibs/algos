package algos.projecteuler;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Problem3Task implements Runnable
{
    private AtomicLong primeFactor;
    private long i;

    
    public Problem3Task(AtomicLong primeFactor, long i)
    {
        this.primeFactor = primeFactor;
        this.i = i;
    }
    
    
    public void solve()
    {
        if(600851475143L % i == 0 && BigInteger.valueOf(i).isProbablePrime(50))
        {
            primeFactor.set(i);
        }
    }

    
    @Override
    public void run()
    {
        solve();
    }
}