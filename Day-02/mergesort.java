import java.util.*;

public class mergesort{
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


    public static Node sortm(Node head){
        if(head==null || head.next==null) return head;
        Node fast=head;
        Node slow=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node right=slow.next;
        slow.next=null;
        Node left=sortm(head);
        right=sortm(right);

        return merge(left,right);
    }

    public static Node merge(Node left,Node right){
        Node temp=new Node(0);
        Node curr=temp;
        while(left!=null && right!=null){
            if(left.data<right.data){
                curr.next=left;
                left=left.next;
            }
            else{
                curr.next=right;
                right=right.next;
            }
            curr=curr.next; 
        }
        if(left!=null){
            curr.next=left;
        }
        if(right!=null){
            curr.next=right;
        }
        return temp.next;
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
        System.out.println("Merge sorted:");
        sortm(head);
        disp();
    }
}