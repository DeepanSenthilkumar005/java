public class AbudantNumber {
    public static void main(String[] args) {
        int n=12,sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)sum+=i;
        }
        if(n%(sum-n)==0)
            System.out.println("Abudant Number");
        else 
            System.out.println("Abudant Number");
    }
}
