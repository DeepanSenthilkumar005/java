import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length/2;i++)
        {
            int t = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
