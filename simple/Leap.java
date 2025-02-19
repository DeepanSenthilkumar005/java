import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        System.out.print("Enter the year : ");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        System.out.println(year+(((year%4==0 && year%100!=0)|| year%400==0)?(" is Leap year"):(" is not Leap Year")));
    }    
}
