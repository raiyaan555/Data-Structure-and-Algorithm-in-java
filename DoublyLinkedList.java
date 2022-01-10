import java.util.*;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    
private class ListNode{
    int data;
    ListNode next, previous;
    
    ListNode(int data){
        this.data = data;
    }
}

public DoublyLinkedList(){
    this.head = null;
    this.tail = null;
    this.length = 0;
}

public boolean isEmpty(){
    return length == 0;
}

public int length(){
    return length;
}


// to display forward in double linked list

public void displayForward(){
    if (head == null){
        return;
    }
    ListNode temp = head;
    while(temp!=null){
        System.out.print(temp.data +"-->");
        temp  = temp.next;
    }
    System.out.print("null");
 
}

// to display backwards

public void displayBackward(){
    if (tail == null){
        return;
    }
    ListNode temp = tail;
    while(temp!=null){
        System.out.print(temp.data +"-->");
        temp = temp.previous;
    }
    System.out.print("null");
 
}

// to insert node at the beginningof the doubly linked list

public void insertNodeBeggining(int value){
ListNode newNode = new ListNode(value);
if(isEmpty()){
    tail = newNode;
}
else{
    head.previous = newNode;
}
newNode.next = head;
head = newNode;
}


// to insert node at the end of the doubly linked list

public void insertNodeEnding(int value){
    ListNode newNode = new ListNode(value);
    if(isEmpty()){
        tail = newNode;
    }
    else{
       tail.next = newNode;
       newNode.previous = tail;
    }
        tail = newNode;
    }


    // to delete node from the starting of the node
    
    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        }
        else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        return temp;
    }


     // to delete node from the ending of the node

     public ListNode deleteEnd(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head == tail){
            head = null;
        }
        else{
           tail.previous.next = null;
        }
       tail = tail.previous;
        temp.previous = null;
        return temp;
    }


public static void main(String[] args) {
    // System.out.println("Hello");

}
}
