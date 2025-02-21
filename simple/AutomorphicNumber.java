// import java.lang.*;
public class AutomorphicNumber {
    public static void main(String[] args) {
        int n=5;
        int digit = (int)Math.log10(n)+1;
        int s = n*n;
        if((s%(Math.pow(10,digit)))==n)
            System.out.println("It is Automorphic Number");
        else
            System.out.println("It is not Automorphic Number");


    }
}
