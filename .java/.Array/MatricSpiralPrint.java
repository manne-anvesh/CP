import java.util.*;
public class MatricSpiralPrint 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            int i,j;
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
                    System.out.println(arr[i][j]+" ");
                }
                break;
            }
            t--;
        }
        sc.close();
    }
}

