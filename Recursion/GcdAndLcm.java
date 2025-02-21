public class GcdAndLcm {
    public static void main(String[] args) {
        int num1=15,num2=99;
        int gcd=gcd(num1,num2);
        System.out.println("Gcd is "+gcd);
        System.out.println("Lcm is "+(num1*num2)/gcd);
    }
    public static int gcd(int a,int b)
    {
        if(a==0)return b;
        return gcd(b%a,a);
    }
}
