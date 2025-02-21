public class HarshadNumber {
    public static void main(String[] args) {
        int n=21;
        System.out.println((check(n)?"":"Not ")+"Harshad Number");

    }
    public static boolean check(int n)
    {
        if(n<11 && n>0) return true;
        else{
            int n1=n,sum=0;
            while(n1>0)
            {
                sum+=n1%10;
                n1/=10;
            }
            if(n%sum==0) return true;
        }
        return false;        
    }
}
