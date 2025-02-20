public class PerfectSquare {
    public static void main(String[] args) {
        int n=49;
        System.out.println((per(n)?"":"Not a ")+"Perfect Square");
    }
    public static boolean per(int n)
    {
        if(n>0)
        {
            int s=(int)Math.sqrt(n);
            return(s*s==n);           
        }

        return false;
    }
}
