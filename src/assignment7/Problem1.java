package assignment7;

public class Problem1 {
    public static void main(String[] args) {
        StackNode node1 = new StackNode(10);
        StackNode node2 = new StackNode(20);
        StackNode node3 = new StackNode(30);
        
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}

class StackNode {
    int data;
    StackNode next;
    
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    private StackNode top;
    
    StackLinkedList() {
        top = null;
    }
    
    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to stack");
    }
    
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    
    boolean isEmpty() {
        return top == null;
    }
    
    void display() {
        StackNode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}