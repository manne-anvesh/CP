import java.util.*;
public class SumOfPairs 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) 
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean res = Solve(arr,k,n);
            if(res)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }   
    }
    public static boolean Solve(int[] arr,int k,int n)
    {
        int i = 0,j = n-1;
        while(i < j)
        {
            if(arr[i]+arr[j]==k)
            {
                return true;
            }
            else if(arr[i]+arr[j]<k)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return false; 
    }
}