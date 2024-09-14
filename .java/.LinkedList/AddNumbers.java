// /* Problem Statement : Given the heads of two non-empty linked lists representing two non-negative integers. 
// The digits are stored in reverse order, and each of their nodes contains a single digit. 
// Add the two numbers and return the sum as a linked list. */





// import java.util.*;


// class Node{
//     int data;
//     Node next;
//     Node(int data)
//     {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class AddNumbers {

//     public static Node head3 = null;

//     public static Node insertNode(Node head,int val){
//         Node newnode = new Node(val);
//         if(head == null)
//         {
//             head = newnode;
//         }
//         else
//         {
//             Node temp = head;
//             while(temp.next != null)
//             {
//                 temp = temp.next;
//             }
//             temp.next = newnode;
//         }

//         return head;
//     }


//     public static void CalculateSum(Node head1,Node head2){
//         int sum = 0;
//         int carry = 0;
//         while(head1 != null  && head2 != null )
//         {
//             sum = head1.data + head2.data + carry;
//             if(sum <= 9)
//             {
//                 head3 = insertNode(head3, carry);
//                 carry = 0;
//             }
//             else{
//                 int x = sum%10;
//                 carry = sum/10;
//                 head3 = insertNode(head3, x);
//                 sum = 0;
//             }
//             head1 = head1.next;
//             head2 = head2.next;
//         }
//     }

//     public static void PrintLinkedList(Node head)
//     {
//         System.out.print("Linked List after summation : ");
//         if(head == null)
//         {
//             System.out.print("->null");
//         }
//         else
//         {
//             Node temp = head;
//             while (temp != null) {
//                 System.out.print(temp.data+"->");
//                 temp = temp.next;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter non negative integers for num1: (Enter -1 to exit) ");
//         Node head1 = null;
//         int val = sc.nextInt();
//         while(val != -1)
//         {
//             head1 = insertNode(head1,val);
//             val = sc.nextInt();
//         }
//         System.out.println("Enter non negative integers for num2: (Enter -1 to exit) ");
//         Node head2 = null;
//         val = sc.nextInt();
//         while(val != -1)
//         {
//             head2 = insertNode(head2,val);
//             val = sc.nextInt();
//         }
//         CalculateSum(head1,head2);
//         PrintLinkedList(head3);
//         sc.close();
//     }
// }