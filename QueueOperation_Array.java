class Queue     //creating a class
    {
            int a[]=new int[5];     //setting variables
            int rear=-1;            //The (-1) is refers not creating values or empty
            int front=-1;
    public void add(int data)       //The (add) is enqueue thats mean inserting a new values in rear way
    {
        if (rear==a.length-1)       //If the values are more than array value 5 it shows the queue is full
        {
            System.out.println("Queue Is Full");    
        }
        else if (rear==-1 && front==-1)     // no values now only insert
        {
            rear++;             //the new values are added    |  Another method[(rear=0;)]  |
            front++;
            a[rear]=data;       
        }
        else               //All the contions are fails last hope 
        {
            rear++;
            a[rear]=data;
        }
    }
public void delete()
    {
        if (rear==-1 && front==-1)
        {
            System.out.println("Queue is empty");
            
        }
        else if (rear==front)       //If the array of 5 values are enters or less than values it can be delete the peek/top value
        {
            System.out.println("Removed Element=" + a[front]);      //The a[front] is removing value
            rear=-1;
            front=-1;
        }
        else
        {
            System.out.println("Removed Element=" + a[front]);
            front++;
        }
    }
public void peek()      //Peek is the showing top element
    {
        System.out.println("The top element="+a[front]);    // The print statement will show which is the correct top position
    }

public void display()
    {
        if (rear==-1 && front==-1)     //Checking the condition for deleting process or if we didn't enter the values
        {
            System.out.println("Queue is empty");
        }
        for(int i=front;i<=rear;i++)        //The i variable is defined here. The i=front and i=rear means front to rear valuse
        {
            System.out.println(a[i]);       //if the a[i] is not get means it will not show the remaining values
        }
    }

}

public class QueueOperation_Array {         //It's the main class name QueueOperation_Array
    public static void main(String[] args) {    // main function of class QueueOperation_Array
        Queue  q =new Queue();  // The q means Queue class object 
        q.add(10);          // The q is performed call the Queue class and add means the function name
        q.add(20);          // Why we are opening this ()  just giving values to insert the values
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.delete();             //If we are giving the 2 q.delete it delete the another 20 and 30 values will deleted
        q.peek();               //after add 2 q.delete it will show the 40 will peek/top element 
        q.display();
    }
    
}
