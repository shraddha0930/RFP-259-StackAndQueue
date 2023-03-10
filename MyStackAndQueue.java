package assignments.StackAndQueuesProblem;

import static java.lang.System.exit;

public class MyStackAndQueue {
     // create global top reference variable global
     Node top;

     // Constructor
     MyStackAndQueue() {
         this.top = null;
     }

     public void push(int x) // insert at the beginning
     {
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

     }


}

