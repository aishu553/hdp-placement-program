import java.util.*;

public class StackbySLL {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;
    int size = 0;

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        StackbySLL stack = new StackbySLL();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek()); 
        System.out.println(stack.pop());  
        System.out.println(stack.size()); 
        System.out.println(stack.isEmpty()); 
    }
}