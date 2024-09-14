import java.util.*;
public class BinaryTrailingZeros 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0,i;
        for(i=0;i<=31;i++)
        {
            if(((n >> i) & 1)==0)
            {
                cnt++;
            }
            else
            {
                break;
            }
        }
        System.out.println(cnt);
    }
}