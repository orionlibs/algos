package algos.projecteuler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

//Largest prime factor = https://projecteuler.net/problem=3
public class Problem3
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
    
    
    private static long solve()
    {
        AtomicLong primeFactor = new AtomicLong(0);
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        
        for(long i = 2; i < Math.sqrt(600851475143L); i++)
        {
            executorService.execute(new Problem3Task(primeFactor, i));
        }
        
        return primeFactor.get();
    }
}