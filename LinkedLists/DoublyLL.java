package DSA_90Days_Practice.LinkedLists;

public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public  int size;

    public void print(){
        if(head == null){
            System.out.println("Linked List is Empty, Nothing is there to print");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("Linked List is Empty, Nothing is there to remove");
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("Linked List is Empty, Nothing is there to remove");
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void reverseLL(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.print();
        dll.reverseLL();
        dll.print();
    }
}
