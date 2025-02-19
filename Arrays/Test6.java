
import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,56,7,77};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the Value to be search : ");
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                System.out.println("the value "+arr[i]+" is at the position "+i);
                c=1;
            }
        }
        if(c==0)
        {
            System.out.println("Value is not in the Array");
        }
    }
}
