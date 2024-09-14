import java.util.*;
public class Divisibility
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long cnt=0;
            while(a%b!=0)
            {
                a = a + 1;
                cnt++;
            }
            System.out.println(cnt);
            t--;
        }
        sc.close();
    }
}