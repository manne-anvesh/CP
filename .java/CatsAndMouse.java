import java.util.*;
public class CatsAndMouse 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==b || Math.abs((c-b)) == Math.abs((c-a)))
            {
                System.out.println("Mouse C");
            }
            else if((Math.abs(c-b)) < (Math.abs(c-a)))
            {
                System.out.println("Cat B");
            }
            else
            {
                System.out.println("Cat A");
            }
            t--;
        }
        sc.close();
    }
}
