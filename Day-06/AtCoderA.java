import java.util.*;

public class AtCoderA{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        sb.append('o');
        for(int i=1;i<s.length()-1;i++){
            char ch=s.charAt(i);
            sb.append(ch);
            sb.append('o');
        }
        sb.append(s.charAt(s.length()-1));
        System.out.println(sb.toString());
    }
}
