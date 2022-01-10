import java.util.NoSuchElementException;

public class Queue {

    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }


    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }
        else{
            rear.next = temp;
        } 
        rear = temp;
        length++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if(front == null)
            rear = null;
        length--;
        return result;
    }


    public static void main(String[] args) {
    
    }
    
}

