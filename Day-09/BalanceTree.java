import java.util.*;

class BalanceTree{
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
            Node temp=queue.poll();
            if(temp.left==null){
                temp.left=new Node(data);
                break;
            }
            else{
                queue.add(temp);
            }
            if(temp.right==null){
                temp.right=new Node(data);
                break;
            }
            else{
                queue.add(temp.right);
            }
        }
        return root;

    }

    static int height(Node root){
        if(root==null) return 0;
        int l_height=height(root.left);
        if(l_height==-1) return -1;
        int r_height=height(root.right);
        if(r_height==-1) return -1;
        if(Math.abs(l_height-r_height)>1) return -1;
        return Math.max(l_height,r_height)+1;

    }

    static boolean isBalanced(Node root){
        return height(root)!=-1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            root=insert(root,d);
        }
        if((isBalanced(root))){
            System.out.println("Balanced <3");
        }
        else{
            System.out.println("UnBalanced TT");
        }
    }
}