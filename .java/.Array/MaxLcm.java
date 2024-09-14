import java.util.*;

public class MaxLcm {


    public static int lcm(int a,int b)
    {
        return (a * b)/gcd(a,b);
    }

    public static int gcd(int a,int b)
    {
        while(b != 0)
        {
            int temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int mx = -1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                mx = Math.max(mx,lcm(arr[i],arr[j]));
            }
        }
        System.out.println(mx);
        sc.close();
    }
}