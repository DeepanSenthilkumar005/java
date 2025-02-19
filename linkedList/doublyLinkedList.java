import java.util.Scanner;

public class doublyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner s = new Scanner (System.in);
        int c=1;
        while(c!=0){
            System.out.println("Enter the choice:");
            c=s.nextInt();
            switch(c){
                case 0:
                    c=0;
                    break;

                case 1:
                    System.out.println("Enter the data to add in the list:");
                    int data=s.nextInt();
                    list.add(data);
                    break;
                case 2:
                    list.printfront();
                    break;
                case 3:
                    list.printend();
                    break;
                case 4:
                    list.pop();
                    break;
                case 5:
                    list.shift();
                    break;
                case 6:
                    System.out.println("Enter the data to unshift in the list:");
                    int unshiftData =s.nextInt();                
                    list.unshift(unshiftData);
                    break;
                default:
                    System.err.println("Enter the correct choice");    
                    break;

            }
        }

    }
}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class LinkedList{
    Node head;
    Node tail;
    public void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail = newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            newnode.prev=temp;
            temp.next=newnode;
            tail=newnode;
        }
      
    }
    public void printfront(){
        if(head==null){
            System.out.println("No data found in list");
        }
        else{
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"=>");
                temp=temp.next;
            }
            System.out.print("Null\n");
        }
    }
    public void printend(){
        if(head==null){
            System.out.println("No Data in list");
        }
        else{
            Node temp=tail;
            while(temp!=null){
                System.out.print(temp.data+"=>");
                temp=temp.prev;
            }
            System.out.print("null");
        }
    }
    public void pop(){
        if(head==null){
            System.out.println("Empty list");
        }
        else{
            System.out.println(tail.data+" is poped");
            tail.prev.next=null;
        }
    }
    public void shift(){
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else{
            System.out.println(head.data+" is poped");
            head=head.next;
        }
    }
    public void unshift(int data){
        Node newnode=new Node (data);
        newnode.next=head;
        head=newnode;
    }
}
