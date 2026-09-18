import java.util.*;

class sumLeaf{
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
    static Node root;

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
    static int sumlnodes(Node root){
        if(root==null) return 0;
        int sum=0;
        //if(root.data==-1) return 0;
        if(root.left!=null && root.left.left==null && root.left.right==null) sum+=root.left.data;
        //else if(root.left!=null && root.left.left!=null && root.left.data!=-1 && root.left.left.data==-1 && root.left.right.data==-1) sum+=root.left.data; 
        sum+=sumlnodes(root.left);
        sum+=sumlnodes(root.right);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <n; i++) {
            root=insert(root,sc.nextInt());   
        }
        System.out.println("Sum of Leaf nodes are: "+sumlnodes(root));
    }
}