import java.util.*;
public class ZigZag
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(j=0;j<m;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for(j=m-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            
        }
        sc.close();
    }
}