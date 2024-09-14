import java.util.*;

public class PerfectSquare {

    public static boolean isPerfectSquare(int n)
    {
        int x = (int) Math.sqrt(n);
        if(x*x == n)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            int val = sc.nextInt();
            if(isPerfectSquare(val))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}