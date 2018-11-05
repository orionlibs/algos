package algos.snippets;

import java.util.Scanner;

public class InputScanner
{
    public static void scanner()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }

        scanner.close();
    }
}