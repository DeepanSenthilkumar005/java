import java.util.Arrays;





public class pro {
    
    public static void main(String[] args) {
        problems p = new problems();
        p.rmduplicate();
        // p.pro3();
        // p.pro4();

}
}
class problems{
    static void rmduplicate()
    {
        int[] a={1,2,3,4,5,6,1,2,3,7};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.print(a[0]+" ");
        if(a.length>1)
        {
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[i-1])
                System.out.print(a[i]+" ");
        }
    }
    }

    // Problem 3
    static void pro3(){
        int a[]={3,1,4,6,7,3};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i])
            {
                max=i;
            }
        }
        System.out.print(a[max]+" is at "+max);
    }


    // Problem 4
    // static void pro4(){
    //     String input1="F_ver";
    //     int index = input1.indexOf('_')
    //     String input2="Fever:Filter:Fixer:fiber:tailor:offer";
    //     String []input=input2.split(":");
    //     // System.out.println(Arrays.toString(input));
    //     for(String loop1 : input)
    //     {
    //         if(loop1.length()==input1.length())
    //         {
    //         for(char loop2 : loop1)
    //         {
                
    //         }
    //         }
    //     }
    // }

}


