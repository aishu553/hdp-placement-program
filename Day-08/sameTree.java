import java.util.*;

class sameTree{
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
    
    static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }

    static boolean isSame(Node root1,Node root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null || root1.data!=root2.data) return false;
        return isSame(root1.left,root2.left) && isSame(root1.right,root2.right);
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
        if(isSame(root1,root2)){
            System.out.println("They are the Same !! <33");
        }
        else {
            System.out.println("They are not the Same..... TT ");
        }
    }


}