import java.util.*;


class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class CycleLinkedList {

    public static Node insertNode(Node head,int val)
    {
        Node newnode = new Node(val);
        if(head == null)
        {
            head = newnode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }

        return head;
    }


    public static Node Reverse(Node head)
    {
        if(head == null) return null;
        Node prev = null;
        Node curr = head;
        Node nextnode = head;
        while(nextnode != null)
        {
            nextnode = nextnode.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements to insert :");
        int n = sc.nextInt();
        Node head = null;
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter element "+i+": ");
            int val = sc.nextInt();
            head = insertNode(head,val);
        }
        boolean ans = CheckCycle(head);
        if(ans)
        {
            System.out.println("No Cycle");
        }
        else
        {
            System.out.println("Cycle");
        }
        sc.close();
    }

    public static boolean CheckCycle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return false;
        }
        return true;
    }
}