class Stack{
    int a[];
    int capacity;
    int top;
    public Stack(int capacity){
        this.capacity = capacity;
        top = -1;
        a = new int[capacity]; 
    }

    void push(int data){
        if(top == capacity-1){
            throw new IllegalArgumentException("overflow");
        }
        else{
            top++;
            a[top] = data;
        }
    }

    int pop(){
        if(top == -1){
            throw new IllegalArgumentException("underflow");
        }
        int res = a[top];
        top--;
        return res;
    }

    int peek(){
        if(top == -1){
            throw new IllegalArgumentException("underflow");
        }
        else{
            return a[top];
        }
    }

    boolean isEmpty(){
        return top == -1;
    }

    void printStack(){
        if(top == -1){
            throw new IllegalArgumentException("stack empty!!");
        }
        else{
            System.out.println("Stack elements: ");
            for(int i = top; i>=0 ; i--){
                System.out.println(a[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackUsingArray{
    public static void main(String [] args){
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.printStack();

        System.out.println("Popping top element : " + stack.pop());

        stack.printStack();
        System.out.println("Top element: " + stack.peek());

    }
}
