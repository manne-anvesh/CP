import java.util.*;
public class Team 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int cnt=0,res=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<3;j++)
            {
                if(arr[i][j]==1)
                {
                    cnt=cnt+1;
                    if(cnt==2)
                    {
                        res = res + 1;
                    }
                }
            }
            cnt=0;
        }
        System.out.println(res);
        sc.close();
    }
}
