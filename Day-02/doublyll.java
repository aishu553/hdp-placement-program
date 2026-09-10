import java.util.*;

class doublyll{
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
    static Node tail;
    public static void insertfst(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        head.prev=nn;
        nn.next=head;
        head=nn;
    }
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

    public static void insertpos(int data, int pos){
        if(pos==1){
          insertfst(data);  
          return;
        } 
        Node nn=new Node(data);
        int trav=1;
        Node temp=head;
        while(trav<pos-1 && temp!=null){
            trav++;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Invalid Position. Try again.");
            return;
        }
        if(temp.next==null){
            insertlast(data);
            return;
        } 
        temp.next.prev=nn;
        nn.next=temp.next;
        temp.next=nn;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            insertlast(x);
        }
        System.out.println("Insertion successful. Displaying.....");
        disp();
        System.out.println("Enter the data and position to insert:");
        int d=sc.nextInt();
        int pos=sc.nextInt();
        insertpos(d,pos);
        System.out.println("Enter the data and position to insert:");
        disp();
    }
}