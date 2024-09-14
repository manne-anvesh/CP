import java.util.*;
public class JewelsStones
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = sc.nextLine();
        int i,j,cnt=0;
        for(i=0;i<res.length();i++)
        {
            for(j=0;j<str.length();j++)
            {
                if(res.charAt(i)==str.charAt(j))
                {
                    cnt = cnt+1;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
