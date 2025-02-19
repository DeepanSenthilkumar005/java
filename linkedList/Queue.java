// import java.util.prefs.NodeChangeEvent;

class Node{
    int data;
    Node next;
    Node (int data)
    {
        this.data = data;
        this.next = null;
    }
}
class queueMethods{
   public  Node head;
   public Node tail;

    public queueMethods(){
        this.head=this.tail=null;
    }
     void enqueue(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
        tail.next=newNode;
            }
            tail=newNode;
        }

     void dequeue()
    {
        if(head==null)
        {
            System.out.println("No data to Dequeue");
        }
        else{
            head=head.next;
            if(head==null)
                tail=null;
        }
    }


     void Peek()
    {
        if(head==null)
            {
                System.out.println("No data in the list");
            }
        else
        {
            System.out.println("Data is "+head.data);
        }
    }


     void Display()
    {
        if(head!=null)
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
        System.out.print("Null\n");
    }

    void isEmpty()
    {

        System.out.println(head==null?"true":"False");
    }

}
class Queue{
    public static void main(String[] args) {
        queueMethods q = new queueMethods();
        q.isEmpty();
        q.Display();    
        q.dequeue();
        q.Display();
        q.enqueue(5);    
        q.Display();    
        q.isEmpty();
        q.enqueue(7);    
        q.enqueue(9);    
        q.Display();   
        q.Peek(); 
        q.Display();  
        q.dequeue();
        q.Display();  

    }
}