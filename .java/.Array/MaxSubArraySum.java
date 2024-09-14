import java.util.*;
public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = Solve(arr,n);
        System.out.println(ans);
        sc.close();
    }

    public static int Solve(int[] arr,int n)
    {
        int max = -1;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum + arr[i];
            if(sum < 0)
            {
                sum = 0;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
