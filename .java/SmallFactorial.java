import java.util.*;
import java.math.BigInteger;
public class SmallFactorial {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            BigInteger fact = BigInteger.ONE;
            int i;
            for(i=n;i>0;i--)
            {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fact);
            t--;
        }
        sc.close();
    }
}
