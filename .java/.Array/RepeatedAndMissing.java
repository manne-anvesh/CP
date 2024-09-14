import java.util.*;

public class RepeatedAndMissing 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] brr = findMissingAndRepeatedValues(arr);
        System.out.println(Arrays.toString(brr));
    }

    public static int[] findMissingAndRepeatedValues(int[][] arr) 
    {
        int n = arr.length;
        int[] cnt = new int[n * n + 1];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                cnt[arr[i][j]]++;
            }
        }

        int[] res = new int[2];
        for (int i = 1; i <= n * n; i++) 
        {
            if (cnt[i] == 2)
            {
                res[0] = i; 
            }
            if (cnt[i] == 0)
            {
                res[1] = i; 
            }
        }
        return res;
    }
}
