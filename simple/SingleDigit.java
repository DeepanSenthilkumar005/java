import java.util.*;
public class SingleDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the number : ");
        int n=s.nextInt();
        int sum=0,c=0,temp=n;
        while(n>10)
        {
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            c++;
            n=sum;
            sum=0;
        }
        System.out.println(n+" have got by adding the number "+temp+" by "+c+" times");

    }
}
