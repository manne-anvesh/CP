//https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
import java.util.*;
import java.util.Collections;

public class MinMaxSum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int val = sc.nextInt();
            arr.add(val);
        }
        Collections.sort(arr);
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<4;i++)
        {
            sum1 = sum1 + arr.get(i);
        }
        for(int i=1;i<5;i++)
        {
            sum2 = sum2 + arr.get(i);
        }
        System.out.println(sum1+" "+sum2);
        sc.close();
    }
}
