public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.add(10);
        // list.add(34);
        // list.add(112);
        // list.add(11);
        list.print();      
        list.pop(); 
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
class LinkedList{
    Node head;
    public void add(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
        
    }
    public void print(){
        if(head!=null){
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"=>");
                temp=temp.next;
            }
        }
        System.out.print("Null\n");
    }
    public void pop(){
        if(head==null)
        {
            System.out.println("\nNo data to delete");
        }
        else{
            Node temp=head,prev=temp;
            while(temp.next!=null)
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
        }
    }
}
