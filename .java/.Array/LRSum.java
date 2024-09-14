import java.util.*;
public class LRSum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        int i,lsum=0,rsum=0,j;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            rsum=0;
            lsum=0;
            for(j=i+1;j<n;j++)
            {
                rsum = rsum+arr[j];
            }
            for(j=i-1;j>=0;j--)
            {
                lsum = lsum+arr[j];
            }
            brr[i]=Math.abs(lsum-rsum);
        }
        for(i=0;i<n;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
}