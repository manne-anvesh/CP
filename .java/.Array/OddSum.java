import java.util.*;
public class OddSum 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i,sum=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
            {
                sum = sum+arr[i];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
