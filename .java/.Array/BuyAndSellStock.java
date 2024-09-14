import java.util.*;
public class BuyAndSellStock 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            int pos = -1;
            int profit=0;
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
                if(arr[i] < min)
                {
                    min = arr[i];
                    pos = i;
                }
            }
            if(pos==n-1)
            {
                System.out.println("0");
            }
            else if(pos==n-2)
            {
                System.out.println(arr[n-1]-arr[n-2]);
            }
            else
            {
                for(int i = pos+1;i<n;i++)
                {
                    if((arr[i]-arr[pos])>profit)
                    {
                        profit = arr[i]-arr[pos];
                    }
                }
                System.out.println("Profit :"+profit);
            }
            t--;
        }
    }
}
