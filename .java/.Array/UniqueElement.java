import java.util.*;
public class UniqueElement 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        int[] crr = new int[n];
        int i,j,cnt=0,pos=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            brr[i]=0;
        }
        for(i=0;i<n;i++)
        {
            cnt=0;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt++;
                }
            }
            brr[i]=cnt;
        }
        for(i=0;i<n;i++)
        {
            if(brr[i]==1)
            {
                crr[i]=arr[i];
            }
        }
        for(i=0;i<n;i++)
        {
            if(crr[i]>0)
            {
                System.out.print(crr[i]+" ");
            }
        }
        sc.close();
    }
}