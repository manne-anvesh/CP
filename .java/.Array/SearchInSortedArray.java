/*
Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values) and a target value k. 
Now the array is rotated at some pivot point unknown to you. 
Find the index at which k is present and if k is not present return -1.
 */



import java.util.*;

public class SearchInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = Solve(arr,n,k);
        System.out.println(ans);
        sc.close();
    }

    public static int Solve(int[] arr,int n,int k)
    {
        int low = 0;
        int high = n-1;
        while (low <= high) 
        {
            int mid = (low + high)/2;
            if(arr[mid] == k)
            {
                return mid;
            }
            else if(arr[low] <= arr[mid]) 
            {
                if(arr[low] <= k && k <= arr[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid + 1;
                }
            }   
            else 
            {
                if(arr[mid] <= k && k <= arr[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}