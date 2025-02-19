import java.util.*;
public class sumofn{
    public static void main(String[] args)
    {
        System.out.println("Enter the 1 to find sum of n or 2 to range : ");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        if (choice == 1) {
            sumofnat();
        } else {
            sumofnran();
        }
        

    }

    public static  void sumofnat()
    {
        System.out.println("Enter the number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n*=n+1;
        System.out.println(n/2);
    }

    public static void sumofnran()
    {
        System.out.println("Enter the starting number:");
        Scanner s = new Scanner(System.in);
        int st = s.nextInt();
        System.out.println("Enter the Ending number:");
        int n = s.nextInt();
        n*=n+1;
        st--;
        st*=st+1;
        System.out.println((n/2)-(st/2));
    }
}