import java.util.*;

class deleteBST{
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

    static int minval(Node root){
        if(root==null) return 0;
        int min=root.data;
        while(root.left!=null){
            root=root.left;
            min=root.data;
        }
        return min;

    }
    
    static Node delete(Node root,int target){
        if(root==null) return null;
        if(target<root.data){
            root.left=delete(root.left,target);
        }
        else if(target>root.data){
            root.right=delete(root.right,target);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            root.data=minval(root.right);
            root.right=delete(root.right, root.data);
        }
        return root;
        
    }

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

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            root=insertt(root,d);
        }
        System.out.println("Insertion Successful...");
        System.out.println("Element to delete:");
        int target=sc.nextInt();
        delete(root, target);
        System.out.println("Deleting...");
        levelorder(root);

    }

}