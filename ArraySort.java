import java.util.Arrays;

public class ArraySort {

    static int findMinimum(int[] arr,int initial,int finalvalue)
    {
        int index = initial;
        int minimum=initial;
        while(index!=finalvalue-1)
        {
            if(arr[index+1]<arr[minimum])
            {
                minimum=index+1;
            }
            index++;
        }

        return minimum;
    }

    static void print(int[] arr)
    {
        System.out.println("" );
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr={42,12,5,55,6,61,3,59,32,1,8};
        int k=4;
        arr=findArraySort(arr,k);
        print(arr);
    }

    private static int[] findArraySort(int[] arr, int k) {
        int initial = 0;
        while(initial!=k)
        {
            int index=findMinimum(arr,initial,k);
            int temp=arr[initial];
            arr[initial]=arr[index];
            arr[index]=temp;
            initial++;
        }
        int finalvalue = arr.length-1;
        while(finalvalue != k)
        {
            int index=findMinimum(arr,k,finalvalue);
            int temp=arr[finalvalue];
            arr[finalvalue]=arr[index];
            arr[index]=temp;
            finalvalue--;
        }
        return arr;
    }
}



