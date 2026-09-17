import java.util.*;

class levelOrder{
    static  class Node{
        Node left;
        int data;
        Node right;
        Node(int data){
            this.left=null;
            this.data=data;
            this.right=null;
        }
    }
    static Node root;

    static Node insertt(Node r,int data){
        if(r==null){
            return new Node(data);
        }
        if(data<r.data){
            r.left=insertt(r.left,data);
        }
        else if(data>r.data){
            r.right= insertt(r.right,data);
        }
        return r;
    }

    

    static void levelorder(Node root){
        if(root==null) return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp=queue.remove();
            System.out.print(temp.data+" ");            
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
        }
        
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            root=insertt(root,d);
        }
        System.out.println("Insertion Successful...");
        
        levelorder(root);

    }
}