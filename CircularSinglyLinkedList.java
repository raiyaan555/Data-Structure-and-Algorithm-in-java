import java.util.*;

public class CircularSinglyLinkedList {
   private static ListNode last;
   private int length;

   private class ListNode{
       private ListNode next;
       private int data;


       public ListNode(int data){
            this.data = data;
       }
   }
   public CircularSinglyLinkedList(){
       last = null;
       length = 0;
   }
   public int length(){
       return length;
   }

   public boolean isEmpty(){
       return length == 0;
   }

   public void createLinkedList(){
       ListNode first = new ListNode(1);
       ListNode second = new ListNode(2); 
       ListNode third = new ListNode(3);
       ListNode fourth = new ListNode(4);
       ListNode fifth = new ListNode(5);

       first.next = second;
       second.next = third;
       third.next = fourth;
       fourth.next = fifth;
       fifth.next = first;

       last = fifth;

   }


//    to traverse in a circular linked list

public static void displayElements(){
    if(last==null)
        return;
        ListNode first = last.next;
        while(first!=last){
            System.out.print(first.data+"-->");
            first = first.next;
        
        }

        System.out.println(first.data);


    }

    // to insert node at the start of the circularlinked list

    public void insertStart(int data){
        ListNode temp = new ListNode(data);
        if(last == null){
            last = temp;
        }
        else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }


    // to indert node at the ending of the circular linked list

    public void insertLastNode(int data)
{
    ListNode temp = new ListNode(data);
    if(last == null){
        last = temp;
        last.next = last;
    }
    else{
        temp.next = last.next;
        last.next = temp;
        last = temp;
    }
    length++;
}

// to remove the node form the first node of the circuylar singly linked list

public ListNode removeFirstNode(){
        if(isEmpty())
    {
        throw new NoSuchElementException();
    }
    ListNode temp = last.next;
    if(last.next == last){
        last = null;
    } else{
        last.next  = temp.next;
    }
    temp.next = null;
    length--;
    return temp;
}


   public static void main(String[] args) {
       CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createLinkedList();  
   }





}



