import java.util.*;
public class SumOfTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int key = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean res = solve(arr, key, n);
            if (res) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    public static boolean solve(int[] arr, int key, int n) {
        for (int i = 0; i < n - 2; i++) 
        {
            int target = key - arr[i];
            int left = i + 1, right = n - 1;

            while (left < right) 
            {
                int currentSum = arr[left] + arr[right];
                if (currentSum == target) {
                    return true;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return false;
    }
}


