import java.util.*;

class CodeChef1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a+b)%2==0){
            int ans=(a-b)/2;
            System.out.println(ans);
        }
        else{
            System.out.println("-1");
        }

    }
}