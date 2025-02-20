public class StrongNumber {
    public static void main(String[] args) {
        int n=145,t=n,sum=0;
        while(t>0)
        {
            sum+=fact(t%10);
            t/=10;
        }
        if(n==sum)System.out.println("Strong Number");
        else System.out.println("Not Strong Number");
    }
    public static  int fact(int n)
    {
        if(n<2) return n;
        return n*fact(n-1);
    }
}
