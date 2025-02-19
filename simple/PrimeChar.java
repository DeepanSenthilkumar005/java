package simple;

import java.util.Scanner;

public class PrimeChar {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine();
        System.out.println("the String is "+str); 
        for(int i=0;i<str.length();i++)
        {
            // System.out.println("ASCII for "+str.charAt(i)+" is "+(int)str.charAt(i));
            int n = str.charAt(i);
            boolean c = true;
            for(int j=2;j<n;j++)
            {
                if(n%j==0)
                {
                    c=false;
                System.out.print(str.charAt(i));
                break;
                }
            }
            if(c){
                System.out.print("*");
            }
        }
    }
}
