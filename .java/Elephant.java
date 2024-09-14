import java.util.*;
public class Elephant 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int n = sc.nextInt();
        int cnt=0,sum=0,res=0,i;
        for(i=n-1;i>=0;i--)
        {
            if((sum+arr[i])<=n)
            {
                res = res+1;
                break;
            }
        }
        System.out.println(res);
        sc.close();
    }
}

