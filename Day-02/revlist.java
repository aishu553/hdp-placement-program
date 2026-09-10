import java.util.*;

public class revlist{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;

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

    public static Node reverseList(Node head) {
        Node prev=null;
        Node temp=head;
        Node nxt=null;
        while(temp!=null){
            nxt=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nxt;
        }
        return prev;
    }

    public static void bubsort(){
        boolean didswap;
        for(Node i=head;i!=null;i=i.next){
            didswap=false;
            for(Node j=head;j.next!=null;j=j.next){
                if(j.data>j.next.data){
                    int temp=j.data;
                    j.data=j.next.data;
                    j.next.data=temp;
                    didswap=true;
                }
            }
            if(!didswap) return;

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            inslast(x);
        }
        System.out.println("Inserted Successfully. Displaying....");
        disp();
        // head = reverseList(head);
        // System.out.println("Reversed:");
        System.out.println("Bubble sorted:");
        bubsort();
        disp();
    }
}