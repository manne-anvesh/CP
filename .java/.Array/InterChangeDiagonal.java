import java.util.*;
public class InterChangeDiagonal
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            int temp=arr[i][i];
            arr[i][i]=arr[i][n-i-1];
            arr[i][n-i-1]=temp;
        }   
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }         
        sc.close();                                                   
    }                                                                  
}                                                                   
