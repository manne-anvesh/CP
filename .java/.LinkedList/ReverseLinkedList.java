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

public class ReverseLinkedList {

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

    public static void PrintList(Node head)
    {
        if(head == null) return;
        while(head != null)
        {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println();
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
        System.out.println("Before Reverse :");
        PrintList(head);
        head = Reverse(head);
        System.out.println("After Reverse :");
        PrintList(head);
        sc.close();
    }
}