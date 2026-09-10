import java.util.*;

public class LC_24{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void inslast(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
    }

    public static void disp() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void swapnode(){
        if(head.next.next==null){
            Node temp=head;
            head=head.next;
            head.next=head;
            return;
        }
        Node lead=head;

        Node fast=head.next.next;
        while(fast!=null){
            Node temp=lead;
            lead=lead.next;
            lead.next=temp;
            lead.next=fast;
            lead=fast;
            fast=fast.next.next;
        }
        fast.next=null;
    }

    static Node head;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            inslast(x);
        }
        System.out.println("Insertion Successful.Displaying....");
        disp();
        System.out.println("Swapping the adjacent nodes....");
        swapnode();
        disp();
    }
}