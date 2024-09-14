// Given a linked list and an integer N, the task is to delete the Nth 
// node from the end of the linked list and print the updated linked list.


/* Steps
 1.Initialize two pointers, `slow` and `fast`, to the head of the linked list. Initially, only fast will move till it crosses N nodes, after which both of the pointers will move simultaneously.
 2.Traverse the linked list till the fast pointer reaches the last node, that is, the Lth Node, at this stage, the slow pointer is guaranteed to be at the (L-N)th node.
 3.Point this slow pointer to the (L-N+2)th node, effectively skipping the Nth node from the end or the (L-N+1)th node from the start.
 */

import java.util.*;

public class DeleteNthNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.close();
    }
}