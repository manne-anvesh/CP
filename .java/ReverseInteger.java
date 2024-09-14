import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0)
        {
            n = -1 * n;
            int sum = 0;
            while(n > 0)
            {
                int rem = n%10;
                sum = sum * 10 + rem;
                n = n/10;
            }
            sum = sum * -1;
            System.out.println(sum);
        }
        else
        {
            int sum = 0;
            while(n > 0)
            {
                int rem = n%10;
                sum = sum * 10 + rem;
                n = n/10;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}