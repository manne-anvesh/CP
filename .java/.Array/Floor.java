import java.util.Arrays;
import java.util.Scanner;

public class Floor {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int q = sc.nextInt();
        while(q-- > 0)
        {
            int x = sc.nextInt();
            int res = Integer.MAX_VALUE;
            int low = 0, high = n - 1;
            while(low <= high)
            {
                int mid = (low + high) / 2;
                if(arr[mid]==x)
                {
                    res = arr[mid];
                    break;
                }
                else if(arr[mid]>x)
                {
                    res = arr[mid];
                    high = mid-1;
                }
                else
                {
                    low = mid + 1;
                }
            }

            System.out.println(res);
        } 
    }
}