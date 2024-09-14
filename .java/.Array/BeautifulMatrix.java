import java.util.Scanner;
import java.lang.Math;
public class BeautifulMatrix 
{
    public static void main(String[] args) 
    {
        int n = 5,i,j,ii=0,jj=0;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                {
                    ii = i;
                    jj = j;
                }
            }
        }
        int res = Math.abs(2-ii)+Math.abs(2-jj);
        System.out.println(res);
    }
}
