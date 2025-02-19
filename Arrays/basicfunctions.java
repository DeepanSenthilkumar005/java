import java.util.*;

class basicfunction{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        // TODO:Traversal

        // System.out.println("Enter the size of the Array : ");
        // int size = s.nextInt();
        // int []arr = new int[size];
        // for(int i=0;i<size;i++)
        // {
        //     System.out.println("enter the data : ");
        //     arr[i] = s.nextInt();
        // }        
        // System.out.println(Arrays.toString(arr));

        
        // TODO : Searching

        // int arr[] = {11,66,33,99,22,55};
        // int n=55;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]==n)
        //     {
        //         System.out.println("index of "+arr[i]+" is "+i);
        //         break;
        //     }
        // }


        // Delection

        int arr[]={44,55,33,11,66,22};
        int num=4;
        try{
            // int newarr[] = new int[arr.length-1];
            // System.arraycopy(arr,0,newarr,0,num);
            // System.arraycopy(arr,num+1,newarr,num,arr.length-num-1);
            // System.out.println(Arrays.toString(newarr));    

            // Method 2
            int newarr[] = new int[arr.length-1];
            // int k=0;
            for(int i=0;i<arr.length;i++)
            {
                if(i==num)
                {
                    for(int j=i;j<arr.length-1;j++)
                    {
                        arr[j]=arr[j+1];
                        i++;
                    }
                    break;
                }
            }
            System.out.println(Arrays.toString(newarr));    


        }
        catch(Exception e){
            System.out.println("Error occurs in Indexing");
        }

    }
}