import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arr[] = {2,4,77,11,0,-33,9999,77,55,4};
        System.out.println(Arrays.toString(arr));
        for(int n : arr)
        {
            if(min>n)
                min=n;
            if(max<n)
                max=n;
        }
        System.out.println("Min is "+min+"\nMax is "+max);
    }
}
