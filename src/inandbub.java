/**
 * Created by ViditShah on 02/05/17.
 */
public class inandbub {
    public static void main(String[] args)
    {
        int size=10;
        int a[] = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i] = (int) (Math.random() * 100);
        }
        BubbleSort(a,size);

    }

    //Bubble Sort
    public static  void BubbleSort(int arr[],int size)
    {
        for(int i=1;i<size;i++)
        {
            for(int j=0;j<size-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }

    //Insertion Sort
    public static void Insertion(int arr[],int size)
    {

        for(int i=0;i<size;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;


                }
            }
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }


}
