import java.util.*;
public class MaxSubArrayProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int pre = 1;
        int suf = 1;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(pre == 0) pre = 1;
            if(suf == 0) suf = 1;
            pre = pre * arr[i];
            suf = suf * arr[n - i - 1];
            ans = Math.max(ans,Math.max(pre,suf));
        }
        System.out.println(ans);
        sc.close();
    }
}
