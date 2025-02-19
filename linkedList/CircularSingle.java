
import java.util.Scanner;

public class CircularSingle {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        // list.add(12);
        // list.add(39);
        Scanner s= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int data=s.nextInt();
            list.add(data);
        }
        list.print();
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
class CircularLinkedList{
    Node head;
    public void add(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
            {
                head=newnode;
            }
        else{
            Node temp=head;
            do
            {
                temp=temp.next;
            }while(temp.next!=head);
            temp.next=newnode;
           }
           newnode.next=head;
    }
    public void print()
    {
        System.out.print("\ndata : ");
        if(head!=null)
        {
            Node temp=head;
            do { 
                System.out.print(temp.data+"=>");
                temp=temp.next;
                
            } while (temp!=head);
        }
        System.out.print("Null\n");
    }
}
