public class ReverseDigit {
    public static void main(String[] args) {
        int n = 987654321;
        int rev=rev(n,0);
        System.out.println(rev);
    }
    public static int rev(int n,int v)
    {
        
        if(n<1) return v;
        return rev(n/10,((v*10)+(n%10)));
    }
}
