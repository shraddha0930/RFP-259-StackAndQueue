package assignments.StackAndQueuesProblem;

import static java.lang.System.exit;

public class MyStackAndQueue {
     Node top;

     // Constructor
     MyStackAndQueue() {
         this.top = null;
     }

     public void push(int x){ // insert at the beginning
         // create new node temp and allocate memory
         Node temp = new Node();
         // check if stack (heap) is full. Then inserting an element would lead to stack overflow
         if (temp == null) {
             System.out.println("Heap Overflow");
             return;
         }
         // initialize data into temp data field
         temp.data = x;
         // put top reference into temp link
         temp.link = top;
         // update top reference
         top = temp;
     }
    public void display() {
        // check for stack underflow
        if (top == null) {
            System.out.println("Stack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.print(temp.data);

                // assign temp link to temp
                temp = temp.link;
                if (temp != null)
                    System.out.print(" -> ");
            }
        }
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        // update the top pointer to point to the next node
        top = (top).link;
    }
     public static void main(String[] args) {
        System.out.println("Welcome to stack and queue ");
         // create Object of Implementing class
         MyStackAndQueue obj = new MyStackAndQueue();
         // insert Stack value
         obj.push(70);
         obj.push(30);
         obj.push(56);


         // print Stack elements
         obj.display();
         // print Top element of Stack
         System.out.println("\nTop element is :" + obj.peek());

         // Delete top element of Stack
         obj.pop();
         obj.pop();
         obj.pop();

         // print Stack elements
         obj.display();

         // print Top element of Stack
         System.out.printf("\nTop element is %d\n",
                 obj.peek());

     }


}

