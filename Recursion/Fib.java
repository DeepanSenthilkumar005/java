public class Fib {
    public static void main(String[] args) {
        int n=6;
        System.out.println("Answer is : "+fib(n));
    }
    public static  int fib(int n)
    {
        if(n==1) return 1;
        if(n==0) return 0;
        System.out.println(n);
        return (fib(n-1)+fib(n-2));

    }
}
