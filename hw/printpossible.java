import java.util.Scanner;

class printpossible{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String str = s.nextLine();
        for(int i=0;i<=str.length()-1;i++)
        {
            for(int j=0;j<=i;j++)
            {   
                System.out.print(str.charAt(j));
            }
            System.out.println("\n");
        }
    }
}