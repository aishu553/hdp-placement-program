import java.util.*;

public class BST{

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

    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    static int countleaf(Node r){
        if(r==null){
            return 0;
        }
        if(r.left==null && r.right==null){
            return 1;
        }
        return countleaf(r.left) + countleaf(r.right);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            root=insertt(root,d);
        }
        System.out.println("PreOrder Traversal: ");
        preorder(root);
        System.out.println();
        System.out.println("InOrder Traversal: ");
        inorder(root);
        System.out.println();
        System.out.println("Post Traversal: ");
        postorder(root);    
        System.out.println();
        System.out.println("Counting the leaf nodes....");
        int count=countleaf(root);
        System.out.println(count);

    }
}