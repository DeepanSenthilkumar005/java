public class Test3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,10};
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1]-1)
            {
                continue;
            }
            else{
                System.out.println("The missing value is : "+(arr[i]+1));
            }
        }
    }
}
