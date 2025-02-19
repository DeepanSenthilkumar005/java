

public class Stack {
    public static void main(String[] args) {
        Methods m = new Methods();
        m.isEmpty();
        m.Display();
        m.peek();
        m.pop();
        m.push(3);
        m.isEmpty();
        m.Display();
        m.push(2);
        m.peek();
        m.push(1);
        m.Display();
        m.isEmpty();
        m.clear();
        m.Display();
        m.isEmpty();

    }
}
class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Methods{
    Node head,tail;
    void push(int data)
    {
        Node newNode=new Node(data);

        if(head==null)
        {
            tail=newNode;
            tail.next=null;
            head=newNode;
        }
        else{
        newNode.next=head;
        head=newNode;
        }
    }

        void pop()
        {
            if(head==null)
            {
                System.out.println("No data to Delete");
            }
            else{
                System.out.println(head.data+" was Poped");
                head=head.next.next;
                if(head==null)
                {
                    tail=null;
                }
            }
        }
        void Display(){
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

        void peek()
        {
            if(head==null)
            {
                System.out.println("No data to Peek");
            }
            else{
                System.out.println(tail.data);
            }
        }

        void isEmpty()
        {
            System.out.println(head==null?"True":"False");
        }

        void clear()
        {
            head=tail=null;
        }
}
