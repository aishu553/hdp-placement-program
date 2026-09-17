import java.util.*;

class CodeChef2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(k<=n){
                System.out.println(0);
            }
            else{
                System.out.println(2*(k-n));
            }

        }

    }
}