public class gcdAndLcm {
    public static void main(String[] args) {
        int a=10,b=5;
        System.out.print("Gcd of the Given number is "+gcd(a,b));
    }
    public static int gcd(int a, int b)
    {
        if(a>b && b>0)
            b=gcd(a,a/b);
        else if(b>a && a>0)
            a=gcd(b,b/a);        
        if(a==0)return b;
        return a;
    }
}
