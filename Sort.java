public class Sort
{
    public static void selectionSort(int[] arr)
    {
        for (int pos = 0; pos < arr.length - 1; pos++)
        {
            int smallest = findSmallest(arr, pos, arr.length - 1);
            swap(arr, pos, smallest);
        }
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int findSmallest(int[] arr, int l, int r)
    {
        int smallestPos = l;
        for (int i = l + 1; i <= r; i++)
        {
            if (arr[i] < arr[smallestPos])
                smallestPos = i;
        }
        return smallestPos;
    }

    private static int findLargest(int[] arr, int l, int r)
    {
        int largestPos = l;
        for (int i = l + 1; i <= r; i++)
        {
            if (arr[i] > arr[largestPos])
                largestPos = i;
        }
        return largestPos;
    }

    public static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) // make passes
        {
            // visit all the unsorted items each pass
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    public static void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1])
            {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

}
