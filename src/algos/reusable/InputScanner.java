package algos.reusable;

import java.util.Scanner;

public class InputScanner
{
    private Scanner scanner;
    
    
    public InputScanner()
    {
        this.scanner = new Scanner(System.in);
    }
    
    
    public void close()
    {
        scanner.close();
    }
    
    
    public String scanLine()
    {
        return scanner.nextLine();
    }
    
    
    public int scanInt()
    {
        return scanner.nextInt();
    }
}