import java.util.*;

class CodeChef3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n-k==1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}