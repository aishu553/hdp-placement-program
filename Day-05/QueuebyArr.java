import java.util.*;

public class QueuebyArr{
    static class queue{
        private int[] a;
        private int front;
        private int rear;
        queue(int size){
            a=new int[size];
            front=0;
            rear=-1;
        }
    
        public void enqueue(int data,int pos){
            if(a.length==pos){
                System.out.println("Queue Full");
                return;
            }
            a[++rear]=data;
        }
        public void poll(){
            if(rear==front){
                System.out.println("Queue full");
                return;
            }
            front++;
        }
        public void disp(){
            if(rear==-1){
                System.out.println("Empty Queue");
                return;
            }
            for(int i=front;i<=rear;i++){
                System.out.println(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the queue length:");
        int n=sc.nextInt();
        queue q=new queue(n);
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            q.enqueue(x,i);
        }
        System.out.println("Polling twice <3 ...");
        q.poll();
        q.poll();
        q.disp();
    }

}