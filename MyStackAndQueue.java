package assignments.StackAndQueuesProblem;

import static java.lang.System.exit;

public class MyStackAndQueue {
     Node top;
     Node front, end;

     // Constructor


    public MyStackAndQueue(Node top, Node front, Node end) {
        this.top = top;
        this.front = null;
        this.end = null;
    }

    public MyStackAndQueue() {

    }

   /* public void push(int x){ // insert at the beginning
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

                // assign temp
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
    }*/

    // Method to add a key to the queue.
    void enqueue(int data) {

        // Create a new LL node
        Node temp = new Node(data);

        // If queue is empty, then new node is front and end both
        if (this.end == null) {
            this.front = this.end = temp;
            return;
        }

        // Add the new node at the end of queue and change last
        this.end.link = temp;
        this.end = temp;
    }
    // Method to remove a key from queue.
    void dequeue() {
        // If queue is empty, return NULL.
        if (this.front == null)
            return;

        // Store previous front and move front one node ahead
        Node temp = this.front;
        this.front = this.front.link;

        // If front becomes NULL, then change end also as NULL
        if (this.front == null)
            this.end = null;

    }
     public static void main(String[] args) {
        System.out.println("Welcome to stack and queue ");
         // create Object of Implementing class
         MyStackAndQueue obj = new MyStackAndQueue();
         /* insert Stack value
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
                 obj.peek());*/

         obj.enqueue(70);
         obj.enqueue(30);
         obj.enqueue(56);
         obj.dequeue();
         obj.dequeue();
         obj.dequeue();
         System.out.println("Queue Front : " + obj.front.data);
         System.out.println("Queue End : " + obj.end.data);
     }


}

