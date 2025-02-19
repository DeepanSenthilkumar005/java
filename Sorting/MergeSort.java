
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2};
        merge(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void merge(int []arr,int n)
    {
            if(arr.length<2)
            {
                return;
            }
            int mid = n/2;
            int l[]=new int[mid];
            int r[]=new int[n-mid];
            for(int i=0;i<mid;i++)
            {
                l[i]=arr[i];
            }
            for(int i=mid;i<n;i++)
            {
                r[i-mid]=arr[i];
            }
            merge(l, mid);
            merge(r, n-mid);
            mergeall(arr,l,r,mid,n-mid);
        }

        static void mergeall(int[] a,int[] l,int[] r,int left,int right)
        {
            int i=0,j=0,k=0;
            while(i<left && j<right)
            {
                if(l[i]<r[j])
                {
                    a[k++]=l[i++];
                }
                else{
                    a[k++]=r[j++];
                }
            }
            while(i<left)
            {
                a[k++]=l[i++];
            }
            while(j<right)
            {
                a[k++]=r[j++];
            }
        }
}
