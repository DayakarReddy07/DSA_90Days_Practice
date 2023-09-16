package DSA_90Days_Practice.LinkedLists;
public class LinkedListOperations {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // ADD FIRST
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add element in middle of the linked list
    public void addMiddle(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("Linked List is Empty, Nothing is there to remove");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static int iterativeSearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("Key was not found in Linked list");
        return -1;
    }

    public static int recursiveSearch(int key){
        return helper(head,key);
    }

    public static int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
// Reversing the linked list
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Find and Remove nth node from end
    public void deleteNthfromEnd(int n){
        Node temp = head;
        int sz = 0;
        while( temp != null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next;
            return;
        }
        Node prev = head;
        int i=1;
        int iTOFind = sz-n;
        while(i < iTOFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public void print(){
        if(head == null){
            System.out.println("Linked List is Empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    //Check if Linked List is palindrome or not
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Mid node
    }

    public boolean isPalindrome(){
        if(head==null || head.next == null){
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    public static void main(String[] args) {
        LinkedListOperations ll = new LinkedListOperations();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addMiddle(2, 9);
        // ll.addMiddle(3,5);
        // System.out.println("The first removed element is : " + ll.removeFirst());
        // System.out.println("The last element removed is :  "+ ll.removeLast());
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(5);
        ll.print();
        // System.out.println("The size of the Linked List is: " + size);
        // System.out.println("The key was found on index : " + ll.recursiveSearch(3) );
        // System.out.println("The reversed linked list is : ");
        // ll.reverse();
        // System.out.println("The linked list after the deleting the node is: ");
        // ll.deleteNthfromEnd(3);
        // ll.print();
        System.out.println("Is Linked List is palindrome: " + ll.isPalindrome());
    }
}
