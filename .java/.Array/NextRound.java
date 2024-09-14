//https://codeforces.com/problemset/problem/158/A
import java.util.*;
public class NextRound 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt()-1;
        int[] arr = new int[n];
        int i,cnt=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i] >= arr[k] && arr[i] > 0)
            {
                cnt=cnt+1;
            }
        }
        System.out.println(cnt);
        sc.close();
    }    
}
