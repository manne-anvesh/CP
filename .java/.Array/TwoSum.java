import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            Solve(arr,n,k);
        }
        sc.close();
    }

    public static void Solve(int[] arr,int n,int k)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int res = k - arr[i];
            if(hm.containsKey(res))
            {
                System.out.println(hm.get(res)+" "+ i);
                break;
            }
            else
            {
                hm.put(arr[i],i);
            }
        }
    }
}
