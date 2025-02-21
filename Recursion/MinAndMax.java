public class MinAndMax {
    public static void main(String[] args) {
        int[] a = {1,6,81,3,5,0,22};
        System.out.println(min(a,a.length-1)+" is the Smallestest Number");
        System.out.println(max(a,a.length-1)+" is the Largest Number");
    }
    public static int max(int[] a,int len)
    {
        if(len==0)return a[len];
        if(a[len]<max(a,len-1)) return max(a,len-1);
        return a[len];
    }
    public static int min(int[] a,int len)
    {
        if(len==0)return a[len];
        if(a[len]>min(a,len-1)) return min(a,len-1);
        return a[len];
    }
}
