import java.util.Scanner;

public class maxoccur {
    public static void main(String []args)
    {
   
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String str = s.nextLine();
        int c=1;
        for(int i=0;i<str.length()-2;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                c++;
            }
            else if(i==str.length()-1 || (str.charAt(i)!=str.charAt(i+1)) && c>1){
                System.err.println(str.charAt(i)+"-"+c);
                c=1;
            }
        }    }
}
