package algos.projecteuler;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.IOUtils;

//XOR decryption = https://projecteuler.net/problem=59
public class Problem59
{
    public static void main(String[] args)
    {
        System.out.println(solve());
    }


    @SuppressWarnings("deprecation")
    private static long solve()
    {
        InputStream ASCIICodesStream = Problem22.class.getResourceAsStream("Problem59-cipher.txt");
        List<Integer> ASCIICodes = new ArrayList<Integer>();
        int keyLength = 3;
        
        try
        {
            String ASCIICodesString = IOUtils.toString(ASCIICodesStream).trim();
            Arrays.stream(ASCIICodesString.split(",")).forEach(code -> ASCIICodes.add(Integer.parseInt(code)));
            int[] key = analyse(ASCIICodes, keyLength);
            int[] decryptedMessage = encrypt(ASCIICodes, key);            
            return Arrays.stream(decryptedMessage).sum();
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }

        return 0;
    }
    
    
    /*private static int[] encrypt1(List<Integer> message, int[] key)
    {
        int[] encryptedMessage = new int[message.size()];
        
        for(int i = 0; i < message.size(); i++)
        {
            encryptedMessage[i] = message.get(i) ^ key[i % key.length];                
        }

        return encryptedMessage;
    }*/


    private static int[] encrypt(List<Integer> message, int[] key)
    {
        int[] result = new int[message.size()];
        List<Integer> selectedKeys = new ArrayList<Integer>();
        
        for(int i = 0; i < message.size(); i++)
        {
            selectedKeys.add(key[i % key.length]);
        }
        
        
        for(int i = 0; i < message.size(); i++)
        {
            result[i] = message.get(i) ^ selectedKeys.get(i);
        }
        
        return result;
    }
    
    
    private static int[] analyse(List<Integer> message, int keyLength)
    {     
        int maxsize = 0;
        
        for(int i = 0; i < message.size(); i++)
        {
            if(message.get(i) > maxsize)
            {
                maxsize = message.get(i);
            }
        }

        int[][] aMessage = new int[keyLength][maxsize + 1];
        int[] key = new int[keyLength];
                    
        for(int i = 0; i < message.size(); i++)
        {
            int j = i % keyLength;
            aMessage[j][message.get(i)]++;
            
            if(aMessage[j][message.get(i)] > aMessage[j][key[j]])
            {
                key[j] = message.get(i);
            }
        }
        
        int spaceAscii = 32;
        
        for(int i = 0; i < keyLength; i++)
        {
            key[i] = key[i] ^ spaceAscii;
        }

        return key;
    }
}