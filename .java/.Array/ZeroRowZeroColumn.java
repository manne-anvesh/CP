import java.util.*;
public class ZeroRowZeroColumn
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int i,j,r,c;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    for(r=0;r<m;r++)
                    {
                        if(arr[i][r]==0)
                        {
                            continue;
                        }
                        arr[i][r]=-1;
                    }
                    for(c=0;c<n;c++)
                    {
                        if(arr[c][j]==0)
                        {
                            continue;
                        }
                        arr[c][j]=-1;
                    }
                }
            }
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(arr[i][j]==-1)
                {
                    arr[i][j]=0;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
