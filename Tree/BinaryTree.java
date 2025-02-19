
import java.util.Scanner;

class BinaryTree {
    public static void main(String[] args) {
        BinaryTreeClass tree = new BinaryTreeClass();
        Scanner s = new Scanner(System.in);
        int c=1;
        while(c!=0){
            System.out.print("\n0=>Exit 1=>Insert 2=>Print 3=>Delete 4=>min 5=>max");
            c=s.nextInt();
            switch(c)
            {
                case 1:
                    System.out.print("\nEnter the data to insert:");
                    int data = s.nextInt();
                    tree.insert(data);
                    break;
                case 2:
                    System.out.println("1=>Inorder 2=>Preorder 3=>PostOrder");
                    int print = s.nextInt();
                    tree.Print(print);
                    break;
                case 3:
                    System.out.println("Enter the value to be deleted : ");
                    int d = s.nextInt();
                    tree.del(d);
                    break;

                case 4:
                    tree.MinVal();
                    break;
                case 5:
                    tree.MaxVal();
                    break;
                case 6:
                    System.out.println("Enter the value to be Searched : ");
                    int sec = s.nextInt();
                    tree.Search(sec);
                    break;
                case 0:
                    System.out.println("Exited from the Tree");
                    c=0;
                    break;
                default:
                    System.err.println("Enter the Correct choice");
                    break;
            }
        }

    }
}
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTreeClass
{
    Node root;
    public void insert(int data)
    {
        // Node newnode = new Node(data);
        root=insertrec(root, data);
    }
    public Node insertrec(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        else if(root.data<data){
               root.right= insertrec(root.right, data);
            }
        else if(root.data>data)
        {
            root.left=insertrec(root.left, data);
        }
        return root;
    }
    public void Print(int print){
        Display(root,print);
        System.out.print("Null\n");
    }
    public void Display(Node root,int print){
        if(root!=null)
        {
            //For preOrder
            if(print==2)
                System.out.print(root.data+"=>");
                Display(root.left,print);
            // For Inorder
            if(print==1)
                System.out.print(root.data+"=>");
                Display(root.right,print);
            // For PostOrder
            if(print==3)
                System.out.print(root.data+"=>");
        }
    }


    // Delete the data from the bst
    public void del(int val)
    {
        // System.out.println((delete(root,val))?"Deleted":"Not Found");
        root=delete(root, val);

    } 
    public Node delete(Node root, int val)
    {
        if(root==null){
            System.out.println("No Data Found");
            return root;
        }
        else if(root.data<val)
            root.right=delete(root.right, val);
        else if(root.data>val)
            root.left=delete(root.left, val);
        else{
            if(root.left==null && root.right==null)
                root=null;
            else if(root.left==null)
                root=root.right;
            else if (root.right==null)
                root=root.left;
            else{
                Node MinNode=FindMin(root);
                root.data=MinNode.data;
                root.right=delete(root.right,MinNode.data);
            }
        }
        return root;
    }
    public Node FindMin(Node root)
    {
        while(root.left!=null)
            root=root.left;
        return root;
    }


    public void MinVal()
    {
        Node temp=FindMin(root);
        System.out.println("Min value is "+temp.data);
    }

    public void MaxVal(){
        Node temp=root;
        while(temp.right!=null)
            temp=temp.right;
        System.out.println("Max value is "+temp.data);
        
    }
    public void Search(int val)
    {
        Node temp=root;
        while (true) { 
            if(temp==null)
            {
                System.out.println("Data not Found");
                break;
            }
            else if(temp.data<val)
                temp=temp.right;
            else if(temp.data>val)
                temp=temp.left;
            else{
                System.out.println("Data Found");
                break;
            }
        }
    }
}
    
