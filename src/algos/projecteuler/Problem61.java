package algos.projecteuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import algos.reusable.HeptagonalNumber;
import algos.reusable.HexagonalNumber;
import algos.reusable.OctagonalNumber;
import algos.reusable.PentagonalNumber;
import algos.reusable.SquareNumber;
import algos.reusable.TriangleNumber;

//Cyclical figurate numbers = https://projecteuler.net/problem=61
public class Problem61
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        int[] solution = new int[6];
        Integer[][] numbers = new Integer[6][];

        for(int i = 0; i < 6; i++)
        {
            numbers[i] = generateNumbers(i);
        }

        for(int i = 0; i < numbers[5].length; i++)
        {
            solution[5] = numbers[5][i];

            if(findNext(5, 1, solution, numbers))
            {
                break;
            }
        }

        return Arrays.stream(solution).sum();
    }


    private static Integer[] generateNumbers(int type)
    {
        List<Integer> numbers = new ArrayList<Integer>();
        int n = 0;
        int number = 0;

        while(number < 10000)
        {
            n++;

            switch(type)
            {
                case 0:
                    number = (int)TriangleNumber.getTriangleNumber(n);
                    break;
                case 1:
                    number = (int)SquareNumber.getSquareNumber(n);
                    break;
                case 2:
                    number = (int)PentagonalNumber.getPentagonalNumber(n);
                    break;
                case 3:
                    number = (int)HexagonalNumber.getHexagonalNumber(n);
                    break;
                case 4:
                    number = (int)HeptagonalNumber.getHeptagonalNumber(n);
                    break;
                case 5:
                    number = (int)OctagonalNumber.getOctagonalNumber(n);
                    break;
            }

            if(number > 999)
            {
                numbers.add(number);
            }
        }

        return numbers.toArray(new Integer[0]);
    }


    private static boolean findNext(int last, int length, int[] solution, Integer[][] numbers)
    {
        for(int i = 0; i < solution.length; i++)
        {
            if(solution[i] != 0)
            {
                continue;
            }
            
            for(int j = 0; j < numbers[i].length; j++)
            {
                boolean unique = true;
                
                for(int k = 0; k < solution.length; k++)
                {
                    if(numbers[i][j] == solution[k])
                    {
                        unique = false;
                        break;
                    }
                }

                if(unique && ((numbers[i][j] / 100) == (solution[last] % 100)))
                {
                    solution[i] = numbers[i][j];
                    
                    if(length == 5)
                    {
                        if(solution[5] / 100 == solution[i] % 100)
                        {
                            return true;
                        }
                    }
                    
                    if(findNext(i, length + 1, solution, numbers))
                    {
                        return true;
                    }
                }
            }
            
            solution[i] = 0;
        }
        
        return false;
    }
}