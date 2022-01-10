

class SinglyLinkedList {
    // instance variable for header node

    private static ListNode head;

    // a class we will create of ListNode
    private static class ListNode {
        private int data; // Generic Type also we can have here
        private ListNode next; // Next Node Pointer

        public ListNode(int data) {
            this.data = data;
            this.next = null; // a new linked list points to null by default
        }

    }
    // display

    public void display(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }

    // count length

    public static int length() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;

        }
        return count;

    }

    // insert first node

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    // insert last node

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    // to insert a node at any place in the given linked list

    public void insert(int position, int data) {

        // assuming the position is between 1 and length of the linkd list

        ListNode node = new ListNode(data);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }

    }

    // used for deleting and returning the deleted node from the first node

    public ListNode deleteFirst() {
        if (head == null) {
            return null;

        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;

    }

    // used for deleting and returning the deleted node from the last node

    public ListNode deleteLast() {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return current;

    }

    // used to delete from any position

    public void delete(int position) {
        // position is valid and starting from 1;

        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count <= position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    // used to search for value;

    public boolean search(int value) {
        ListNode current = head;
        while (current != null) {

            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // reverse a singly linked list

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }

        return previous;

    }

    // Find the middle node of the linked list

    public ListNode getmiddleNode() {
        if (head == null) {
            return null;

        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;

    }

    // Find nth node from the end of the linked list

    public ListNode getNthNodeFromEnd(int n) { // where n is the number from the end
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value n = " + n);
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        int count = 0;
        while (count < n) {
            fastPtr = fastPtr.next;
            count++;
        }
        while (fastPtr != null) {
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
    }

    // Remove duplicates from sorted Singly Linked List

    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;

            } else {
                current = current.next;
            }
        }

    }

    // Insert a node in a sorted linked list

    public ListNode insertNodeSortedList(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            return newNode;
        }
        ListNode Current = head;
        ListNode temp = null;
        while (Current != null && Current.data < newNode.data) {
            temp = Current;
            Current = Current.next;
        }
        newNode.next = Current;
        temp.next = newNode;
        return head;

    }

    // How to remove a given key from singly linked list

    public void deleteNodeKey(int key) {
        ListNode current = head;
        ListNode temp = null;

        if(current != null && current.data == key){
            head = current.next;
            return;
        }

        while (current != null && current.data != key) {
            temp = current;
            current = current.next;

        }

        if (current == null)
            return;

        temp.next = current.next;
    }

    // How to check if the linked list contains a loop

    public boolean checkLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
         while(fastPtr != null && fastPtr.next!=null){
             fastPtr = fastPtr.next.next;
             slowPtr = slowPtr.next;

             if(slowPtr == fastPtr){
                 return true;
             }

         }
         return false;
    }

     // How to check for the starting the linked list that contains a loop

     public ListNode checkLoopStart(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
         while(fastPtr != null && fastPtr.next!=null){
             fastPtr = fastPtr.next.next;
             slowPtr = slowPtr.next;

             if(slowPtr == fastPtr){
                 return getStartingNode(slowPtr);
             }

         }
         return null;
}

public ListNode getStartingNode(ListNode slowPtr){
    ListNode temp = head;
    while(slowPtr != temp){
        temp = temp.next;
        slowPtr = slowPtr.next;

    }
    return temp;

}

// how to remove a loop from a single linked list

public void removeLoopfromLinkedList(){
    ListNode fastPtr = head;
    ListNode slowPtr = head;
     while(fastPtr != null && fastPtr.next!=null){
         fastPtr = fastPtr.next.next;
         slowPtr = slowPtr.next;
         if(slowPtr == fastPtr){
             removeLoop(slowPtr);
             return;

             
     }
}
}

public void removeLoop(ListNode slowPtr )
{
ListNode temp = head;
while(slowPtr.next != temp.next){
    temp = temp.next;
    slowPtr = slowPtr.next;


}
slowPtr = slowPtr.next;
}



    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        // we create the three nodes from notes

        SinglyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);

        // Now we will connect together to form a chain

        SinglyLinkedList.head.next = second;
        second.next = third;

        // sll.insertFirst(11);
        // sll.insertFirst(14);
        // sll.insertFirst(13);
        // sll.insertFirst(12);

        // sll.insertLast(22);
        // sll.insertLast(23);
        // sll.insertLast(24);

        // sll.insert(3, 23);

        // // sll.insert(3, 25);
        // sll.insert(2, 34);

        sll.display(head);
        System.out.println(SinglyLinkedList.length());

        // System.out.println(sll.deleteFirst().data);

        // System.out.println(sll.deleteLast().data);

        // sll.delete(3);

        // System.out.println(sll.search(100));

        ListNode reverseListHead = sll.reverse(head);
        sll.display(reverseListHead);

        ListNode middleNode = sll.getmiddleNode();
        System.out.println("The middle node is " + middleNode.data);

        System.out.println("The nth node is " + sll.getNthNodeFromEnd(5).data);

    }

}