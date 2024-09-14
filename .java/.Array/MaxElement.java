import java.util.*;

public class MaxElement 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }
}