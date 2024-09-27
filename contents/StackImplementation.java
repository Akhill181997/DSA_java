package stack;


public class StackImplementation {
    int stack[] = new int[5]; 
    int top = 0;

    public void push(int data) {
        if (top == 5) {
            System.out.println("Stack is full");
        } else {
            stack[top] = data;
            top++;
        }
    }

    public int pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return -1; 
        } else {
            top--;
            int data = stack[top];
            stack[top] = 0; 
            return data;
        }
    }

    public int peek() {
    int data; 
    
    if (top == 0) {
        System.out.println("Stack is empty");
        data = -1; 
    } else {
        data = stack[top - 1]; 
    }
    
    return data; 
}


    public void show() {
        for (int i = 0; i < top; i++) { 
            System.out.print(stack[i] + " ");
        }
        System.out.println(); 
    }
}
