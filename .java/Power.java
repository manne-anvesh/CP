import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int ans = 1;
            System.out.print("Enter a :");
            int a = sc.nextInt(); // 2
            System.out.print("Enter b :");
            int b = sc.nextInt();// 3
            if (b < 0) {
                b = Math.abs(b);
                ans = 1;
                for (int i = 0; i < b; i++) {
                    ans = ans * a;
                }
                ans = 1/ans;
            } else if (b == 1) {
                System.out.println(1);
            } else {
                ans = 1;
                for (int i = 0; i < b; i++) {
                    ans = ans * a;
                }
            }
            System.out.println("a power b :" + ans);
        }
    }
}