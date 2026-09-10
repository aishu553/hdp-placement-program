import java.util.*;

public class delbyval{
    static class Node{
        Node prev;
        int data;
        Node next;
        Node(int data){
            this.prev=null;
            this.data=data;
            this.next=null;
        }
    }
    static Node head;

    public static void insertlast(int data){
        Node nn= new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
        nn.prev=temp;
    }

    public static void disp() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void delval(int val){
        if(head.data==val && head.next==null){
            head=null;
            return;
        }
        if(head.data==val){
            head=head.next;
            head.prev=null;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
            }
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            insertlast(x);
        }
        System.out.println("Insertion successful. Displaying....");
        disp();
        System.out.println("Enter the data to be deleted:");
        int d=sc.nextInt();
        delval(d);
        System.out.println("Deleted successfully");
        disp();
    }
}