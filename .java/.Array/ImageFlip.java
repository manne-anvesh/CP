import java.util.*;
public class ImageFlip
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] arr = new long[n][m];
        int[][] brr = new int[n][m];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextLong();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                brr[i][j]=arr[i][n-j-1];
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(brr[i][j]==0)
                {
                    brr[i][j]=1;
                }
                else
                {
                    brr[i][j]=0;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
 