import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        char[] arr = s.toCharArray();
        int l = arr.length;
        int i=0;
        int j = l - 1;
        while (i <= j) {
            char temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
            i++;
            j--;
        }
        for(i=0;i<l;i++)
        {
            System.out.print(arr[i]);
        }
    }
}