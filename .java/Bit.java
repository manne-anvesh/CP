import java.util.*;
import java.util.ArrayList;
public class Bit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        int n = sc.nextInt();
        sc.nextLine();
        int i;
        for(i=0;i<n;i++)
        {
            String val = sc.nextLine();
            arr.add(val);
        }
        int cnt=0;
        for(i=0;i<n;i++)
        {
            if(arr.get(i).equals("X++") || arr.get(i).equals("++X"))
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        System.out.println(cnt);
    }
}
