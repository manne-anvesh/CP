import java.util.*;
public class AngryProfessor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int i,cnt=0;
            for(i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
                if(arr[i]<=0)
                {
                    cnt++;
                }
            }
            if(cnt<k)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}

