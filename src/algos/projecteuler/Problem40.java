package algos.projecteuler;

//Champernowne's constant = https://projecteuler.net/problem=40
public class Problem40
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    private static long solve()
    {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < Integer.MAX_VALUE; i++)
        {
            sb.append(Integer.toString(i));
            
            if(sb.length() > 1000000)
            {
                break;
            }
        }
        
        return Long.parseLong(Character.toString(sb.charAt(0)))
                        * Long.parseLong(Character.toString(sb.charAt(9)))
                        * Long.parseLong(Character.toString(sb.charAt(99)))
                        * Long.parseLong(Character.toString(sb.charAt(999)))
                        * Long.parseLong(Character.toString(sb.charAt(9999)))
                        * Long.parseLong(Character.toString(sb.charAt(99999)))
                        * Long.parseLong(Character.toString(sb.charAt(999999)));
    }
}