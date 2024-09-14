import java.io.*;
import java.util.*;
public class Anagram 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String str1 = sc.next();
            String str2 = sc.next();
            char[] str3 = str1.toCharArray();
            Arrays.sort(str3);
            char[] str4 = str2.toCharArray();
            Arrays.sort(str4);
            boolean res = Solve(str3,str4);
            if(res)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }

    public static boolean Solve(char[] str3,char[] str4)
    {
        if(str3.length!=str4.length)
        {
            return false;
        }
        else
        {
            for(int i=0;i<str3.length;i++)
            {
                if(str3[i]!=str4[i])
                {
                    return false;
                }
            }
            return true;
        }
    }
}