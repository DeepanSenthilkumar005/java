import java.util.Arrays;

class Sorting{
    public static void main(String []args)
    {
        SortingMethods sort = new SortingMethods();
        int[] a={5,2,11,546,4,2,46,68};
        System.out.println(Arrays.toString(a));
        // sort.bubble(a);
        // sort.selection(a);
        sort.Insertion(a);



    }
}

class SortingMethods{


    // Buble Sorting
    public void bubble(int a[])

    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    // Selection Sort
    public void selection(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min=i;
            for(int j=i;j<a.length;j++)
                {
                    if(a[min]>a[j])
                    {
                        min=j;
                    }
                }
                int t=a[i];
                a[i]=a[min];
                a[min]=t;

        }
        System.out.println(Arrays.toString(a));
    }

    // Insertion Sort
    public void Insertion(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]<a[j])
                {
                    int t = a[j];
                    a[j]=a[i];
                    a[i]=t;
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}