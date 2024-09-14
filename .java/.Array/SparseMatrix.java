import java.util.*;
public class SparseMatrix
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
        int cnt=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    cnt++;
                }
            }
        }
        if(cnt>=(n*m)/2)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        sc.close();
    }
}
