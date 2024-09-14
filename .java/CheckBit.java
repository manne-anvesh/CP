//https://www.hackerrank.com/contests/smart-interviews-basic/challenges/si-basic-check-bit
import java.util.*;
public class CheckBit
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int i = sc.nextInt();
        if(((n >> i) & 1)==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        sc.close();
    }
}