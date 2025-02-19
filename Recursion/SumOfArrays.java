public class SumOfArrays {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9};
        System.out.println("Sum is "+sum(a,0));
    }
    public static int sum(int[] a,int n)
    {
        if(n<a.length)
            return a[n]+sum(a,n+1);
        
        return 0;
    }
}
