import java.util.*;
public class ColumnSum
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
        int sum;
        for(i=0;i<n;i++)
        {
            sum=0;
            for(j=0;j<m;j++)
            {
                sum = sum + arr[j][i];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}