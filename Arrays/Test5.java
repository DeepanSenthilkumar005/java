import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the index between 0 to "+(arr.length-1));
        Scanner s = new Scanner(System.in);
        int del = s.nextInt();
        int delarr[] = new int[arr.length-1];
        System.arraycopy(arr,0,delarr,0,del);
        System.arraycopy(arr,del+1,delarr,del,arr.length-del-1);
        System.out.println(Arrays.toString(delarr));
        
    }
}
