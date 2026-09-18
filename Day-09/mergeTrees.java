import java.util.*;

class mergeTrees{
    static class Node{
        Node left;
        int data;
        Node right;
        Node(int data){
            this.left=null;
            this.data=data;
            this.right=null;
        }
    }
    static Node root1;
    static Node root2;
    static Node root3;

    static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp=queue.remove();
            if(temp.left==null){
                temp.left=new Node(data);
                break;
            }
            else queue.add(temp.left);
            if(temp.right==null){
                temp.right=new Node(data);
                break;
            }
            else queue.add(temp.right);
        }
        return root;
    }

    static Node mergetree(Node root1,Node root2){
        if(root1==null) return root2;
        if(root2==null) return root1;
        Node merge=new Node(root1.data+root2.data);
        merge.left=mergetree(root1.left, root2.left);
        merge.right=mergetree(root1.right, root2.right);
        return merge;
    }

    static void lvlorder(Node root){
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of tree 1:");
        int n=sc.nextInt();
        System.out.println("Enter the values of tree 1:");
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            root1=insert(root1,d);
        }
        System.out.println("Insertion Successful for Tree 1 <3");
        System.out.println("Enter the size of tree 2:");
        int m=sc.nextInt();
        System.out.println("Enter the values of tree 2:");
        for(int i=0;i<m;i++){
            int d=sc.nextInt();
            root2=insert(root2,d);
        }
        System.out.println("Insertion Successful for Tree 2 <3");
        System.out.println("Merging the two trees...");
        root3=mergetree(root1,root2);
        lvlorder(root3);
    }
}