import java.util.*;
public class fibb
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        int i;
        for(i=2;i<n;i++)
        {
            int c = a+b;
            if(i==n-1)
            {
                System.out.println(c);
            }
            a = b;
            b = c;
        }
        sc.close();
    }
}