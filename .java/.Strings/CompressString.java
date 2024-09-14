import java.util.*;
public class CompressString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Object> arr = new ArrayList<>();
        int i, cnt = 1;
        for (i = 0; i < str.length() - 1; i++) 
        {
            if (str.charAt(i) == str.charAt(i + 1)) 
            {
                cnt++;
            } else 
            {
                arr.add(String.valueOf(str.charAt(i)));
                arr.add(cnt);
                cnt = 1;
            }
        }
        
        arr.add(String.valueOf(str.charAt(i)));
        arr.add(cnt);

        for (Object obj : arr) {
            System.out.print(obj);
        }
        sc.close();
    }
}
