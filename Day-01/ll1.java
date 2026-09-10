import java.util.*;

class ll1 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static void insfirst(int data) {
        Node nn = new Node(data);

        if (head == null) {
            head = nn;
            return;
        }

        nn.next = head;
        head = nn;
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

    public static void inspos(int pos, int data) {
        Node nn = new Node(data);
        if (pos == 1) {
            nn.next = head;
            head = nn;
            return;
        }
        int trav = 0;
        Node temp = head;
        while (trav < pos - 1 && temp != null) {
            trav++;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        nn.next = temp.next;
        temp.next = nn;
    }

    public static int countt() {
        Node temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public static void insmid(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }
        Node temp = head;
        int tot = countt();
        int pos = tot / 2;
        int trav = 0;
        while (trav < pos && temp != null) {
            trav++;
            temp = temp.next;
        }
        nn.next = temp.next;
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

    public static void delfirst() {
        if (head == null) {
            System.out.println("Empty List bro");
            return;
        }
        head = head.next;
    }

    public static void dellast() {
        if (head == null) {
            System.out.println("Empty List bro");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void delpos(int pos){ 
        if (pos == 1) {
            head=head.next;
            return;
        }
        int trav = 1;
        Node temp = head;
        while (trav < pos-1 && temp != null) {
            trav++;
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("null position");
            return;
        }
        temp.next = temp.next.next;
    }
    public static void delvalue(int val){
        if(head.data==val){
            head=head.next;
            return;
        }
        if(head==null){
            System.out.println("Empty bro");
            return;
        }
        Node temp=head;
        while(temp!=null){

        }

    }

    public static void searchh(int val){
        Node temp=head;
        int pos=1;
        while(temp!=null){
            if(temp.data==val){
                System.out.println(val+" found at "+pos);
                return;
            }
            pos++;
            temp=temp.next;
        }
        System.out.println("Value not found :(");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            inslast(x);
        }
        // while (true) {
        //     System.out.println("Enter the operation:");
        //     int sw = sc.nextInt();
        //     switch (sw) {
        //         case 1:
        //             System.out.println("Enter data for insert first:");
        //             int x = sc.nextInt();
        //             insfirst(x);
        //             break;
        //         case 2:
        //             System.out.println("Enter data for insert last:");
        //             int y = sc.nextInt();
        //             inslast(y);
        //             break;
        //         case 3:
        //             System.out.println("Enter data for insert mid:");
        //             int z = sc.nextInt();
        //             insmid(z);
        //             break;
        //         case 4:
        //             System.out.println("Enter data and pos to insert:");
        //             int e = sc.nextInt();
        //             int p = sc.nextInt();
        //             inspos(p, e);
        //             break;
        //         case 5:
        //             System.out.println("Displaying........");
        //             disp();
        //             break;
        //         default:
        //             System.out.println("Exiting........");
        //             return;
        //     }
        // }
        System.out.println("Successful Insertion");
        disp();
        // System.out.println("Enter the position of element to delete:");
        // int pos=sc.nextInt();
        // delpos(pos);
        // disp();
        System.out.println("Enter the element to be searched");
        int val=sc.nextInt();
        searchh(val);
    }
}