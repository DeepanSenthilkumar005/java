
import java.io.BufferedReader;

public class PowerOfNum {
    public static void main(String[] args) {
        BufferedReader
        System.out.println(pow(10,3));
    }
    public static int pow(int n,int p)
    {
        if(p==0)return 1;
        return n*pow(n, p-1);
    }
}
