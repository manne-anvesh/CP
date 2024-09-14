import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class MiddleInLinkedList {


    public static Node insertNode(Node head,int data)
    {
        Node newnode = new Node(data);
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

    public static Node FindMiddle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements into linked list (Enter -1 to exit) :");
        Node head = null;
        int val = sc.nextInt();
        while(val != -1)
        {
            head = insertNode(head,val);
            val = sc.nextInt();
        }
        Node mid = FindMiddle(head);
        System.out.print("Middle Node : "+mid.data);
        sc.close();
    }
}