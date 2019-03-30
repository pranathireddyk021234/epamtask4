import java.io.*;
import java.util.*;

class MidInLinkedList
{ 
    Node head; 
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    void printMiddle() 
    { 
        Node slow_ptr = head; 
        Node fast_ptr = head;
        Node t=head; 
        int c=0;
        while(t!=null){
          t=t.next;
          c++;
         }
        if (head != null) 
        { 
            while (fast_ptr != null && fast_ptr.next != null) 
            { 
                fast_ptr = fast_ptr.next.next; 
                slow_ptr = slow_ptr.next; 
            } 
             System.out.println("The middle element is [" + 
                                slow_ptr.data + "] \n"); 
        } 
    } 
  
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"->"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    } 
  
    public static void main(String [] args) 
    { 
        MidInLinkedList llist = new MidInLinkedList(); 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n; i>0; --i) 
        { 
            int p=sc.nextInt();
            llist.push(p); 
            //llist.printList(); 
	}
            llist.printMiddle(); 
    } 
} 