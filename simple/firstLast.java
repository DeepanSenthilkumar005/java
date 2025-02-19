
import java.util.ArrayList;

public class firstLast {
    public static void main(String[] args) {

        // 15.Given an Array arr[] with n numbers and return it in given Order For
        //     Example :
        //     Input: arr[]={1, 2, 3, 4, 5, 6, 7};
        //     Output: arr[]={1, 7, 2, 6, 3, 5, 4};

        int[] a = {1,2,3,4,5,6,7};
        int n=a.length;
        ArrayList<Integer> b = new ArrayList<>();
        int j=n-1,i=0;
        while(i<=j)
        {
            b.add(a[i++]);
            if(i<=(j))
                b.add(a[j--]);
        }
        
        System.out.println(b);
    }
}
