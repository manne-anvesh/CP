import java.util.*;
public class Stock 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int res = maxProfit(arr,n);
        System.out.println(res);
    }

    public static int maxProfit(int[] arr,int n) 
    {
        int min=arr[0];
        int ans = 0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
            if(ans < (arr[i]-min))
            {
                ans = arr[i]-min;
            }
        }
        return ans;
    }
}
