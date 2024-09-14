import java.util.*;
public class PrimeRange {

    public boolean isPrime(int A) 
    {
        if(A<=1)
        {
            return false;
        }
        else if(A%2==0 && A!=2)
        {
            return false;
        }
        else
        {
            int i;
            for(i=3;i*i<=A;i=i+2)
            {
                if(A%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        PrimeRange p = new PrimeRange();
        int t = sc.nextInt();
        while(t>0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i;
            for(i=a;i<=b;i++)
            {
                if(p.isPrime(i))
                {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
