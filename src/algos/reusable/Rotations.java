package algos.reusable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Rotations
{
    public static List<String> rotateString(String string) 
    {
        List<String> rotations = new ArrayList<String>();
        IntStream.range(0, string.length()).forEach(i -> rotations.add(string.substring(i) + string.substring(0, i)));
        return rotations;
    }
}