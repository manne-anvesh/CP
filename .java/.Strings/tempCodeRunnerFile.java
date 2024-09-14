import java.util.*;

public class PalindromicLengthsSum {


    public static boolean isPalindrome(String s)
    {
        int i = 0;
        int j = s.length() - 1;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int mx = -1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String substr = s.substring(i, j);
                if(isPalindrome(substr))
                {
                    mx = Math.max(mx,substr.length());
                }
            }
        }
        System.out.println(mx);
        sc.close();
    }
}