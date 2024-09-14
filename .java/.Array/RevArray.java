import java.util.*;
public class RevArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
