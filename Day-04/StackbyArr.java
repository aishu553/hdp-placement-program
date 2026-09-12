import java.util.*;

public class StackbyArr{

    static class Stack{
        private char[] arr;
        private int capacity;
        private int top;
        Stack(int cap){
            capacity=cap;
            arr=new char[capacity];
            top=-1;
        }
    

        public void push(char data){
            arr[++top]=data;
        }
        public void pop(){
            top--;
        }
        public char peek(){
            return arr[top];
        }

        public boolean isEmpty(){
            if(top==-1) return true;
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.next();
        Stack stack=new Stack(s.length());
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.peek());
            stack.pop();
        }
        System.out.println(sb.reverse().toString());


    }
}