//https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
import java.util.*;
public class LargestCandles 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i,max=0;
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int cnt=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==max)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
