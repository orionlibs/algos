package algos.codechef.beginner;

import algos.reusable.InputScanner;

//https://www.codechef.com/problems/PERFCONT
public class ABalancedContest
{
    private InputScanner scanner;
    private int[] participantsSolvingEachProblem;
    private int numberOfParticipants;
    
    
    public static void main(String[] args)
    {
        ABalancedContest aBalancedContest = new ABalancedContest();
        aBalancedContest.readInputs();
    }
    
    
    public ABalancedContest()
    {
        this.scanner = new InputScanner();
    }
    
    
    private void readInputs()
    {
        int numberOfTestCases = scanner.scanInt();
        
        if(numberOfTestCases >= 1 && numberOfTestCases <= 500)
        {
            for(int i = 0; i < numberOfTestCases; i++)
            {
                readInputForTest();
            }
        }
        
        scanner.close();
    }
    
    
    private void readInputForTest()
    {
        String line1 = scanner.scanLine();
        String[] tokens = line1.split(" ");
        int numberOfProblems = Integer.parseInt(tokens[0]);
        participantsSolvingEachProblem = new int[tokens.length];
        
        if(numberOfProblems >= 1 && numberOfProblems <= 500)
        {
            numberOfParticipants = Integer.parseInt(tokens[1]);
            
            if(numberOfParticipants >= 1 && numberOfParticipants <= 100000000)
            {
                String line2 = scanner.scanLine();
                tokens = line2.split(" ");
                
                for(int i = 0; i < tokens.length; i++)
                {
                    participantsSolvingEachProblem[i] = Integer.parseInt(tokens[i]);
                    
                    if(participantsSolvingEachProblem[i] < 1 || participantsSolvingEachProblem[i] > numberOfParticipants)
                    {
                        return;
                    }
                }
            }
        }
        
        solve();
    }
    
    
    private void solve()
    {
        int numberOfCakewalkProblems = 0;
        int numberOfHardProblems = 0;
        
        for(int i = 0; i < participantsSolvingEachProblem.length; i++)
        {
            if(participantsSolvingEachProblem[i] >= numberOfParticipants / 2)
            {
                ++numberOfCakewalkProblems;
            }
            else if(participantsSolvingEachProblem[i] <= numberOfParticipants / 10)
            {
                ++numberOfHardProblems;
            }
        }
        
        if(numberOfCakewalkProblems == 1 && numberOfHardProblems == 2)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}