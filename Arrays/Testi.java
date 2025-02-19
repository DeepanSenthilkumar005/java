
import java.util.Arrays;
import java.util.Scanner;

public class Testi {
    public static void main(String[] args) {
        int[] arr = {12,23,56,78,12};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the index between 0 to "+(arr.length-1)+" and the value to be insert ");
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        int val = s.nextInt();
        int newarr[] = new int[arr.length+1];
        System.arraycopy(arr,0,newarr,0,in);
        newarr[in]=val;
        System.arraycopy(arr,in,newarr,in+1,arr.length-in);
        System.out.println(Arrays.toString(newarr));

    }
}
