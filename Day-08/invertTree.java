import java.util.*;

class invertTree{
    static class Node{
        Node left;
        int data;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static Node root1;
    static Node root2;

    static void levelorder(Node root){
        if (root == null) return;

        Queue<Node> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp=q.remove();
            System.out.print(temp.data+" ");

            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
    static Node insert(Node root , int data){
        if(root==null){
            return new Node(data);
        }
        else if(data<root.data){
            root.left=insert(root.left,data);
        }
        else if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }

    static void invert(Node r){
        if(r==null) return;
        Node temp=r.left;
        r.left=r.right;
        r.right=temp;
        invert(r.left);
        invert(r.right);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of tree 1:");
        int n=sc.nextInt();
        System.out.println("Enter the values of tree 1:");
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            root1=insert(root1,d);
        }
        //System.out.println("Enter the size of tree 2:");
        // int m=sc.nextInt();
        // System.out.println("Enter the values of tree 2:");
        // for(int i=0;i<m;i++){
        //     int d=sc.nextInt();
        //     root=insert(root2,d);
        // }
        System.out.println("Insertion Successful...");
        invert(root1);
        System.out.println("Level Order Display....");
        levelorder(root1);
    }
}