public class PrimeNumber {
    public static void main(String[] args) {
        // Initialize the Checking number as 43
        int n=43;
        System.out.println(n+(isPrime(n,2)?" is ":"is Not ")+"Prime Number\n");

        // From the Range from 1 to 100
        for(n=1;n<100;n++)
        System.out.print((isPrime(n,2)?(n+","):""));
    }
    public static boolean isPrime(int n,int v)
    {
        if(n==1)return false;
        if(n==2) return true;
        if(n%v==0)return false;
        if(v>=n/2) return true;
        return isPrime(n,++v);
    }
}
