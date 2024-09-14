//https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
import java.util.*;
public class DiagonalDifferernce
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int i,j;
        int sum1=0;
        int sum2=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                if(i==j)
                {
                    sum1 = sum1 + arr[i][i];
                }
            }
        }
        for(i=0;i<n;i++)
        {
            sum2 = sum2 + arr[i][n-i-1];
        }
        System.out.println(Math.abs(sum1-sum2));
        sc.close();
    }
}
