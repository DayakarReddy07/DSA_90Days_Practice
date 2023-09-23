package DSA_90Days_Practice.QueueDS;
import java.util.*;

public class circularQueueArray {
    static class Queue{
        static int size;
        static int arr[];
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            rear = -1;
            front = -1;
            size = n;
        }
        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public boolean isFull(){
            return (rear+1)%size == front;
        }
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is Full Unable to add data in the queue");
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Nothing is there to remove, Queue is Empty");
            }
             int result = arr[front];
            if(front == rear){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Nothing is there to remove, Queue is Empty");
                  return -1;
            }
         return arr[front]; 
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
