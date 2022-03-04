/**
 * Write a description of class Search here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Search
{
    /**
     * Finds the index where needle first occurs in haystack. 
     */
    public static int linearSearch(int needle, int[] haystack)
    {
        for (int i = 0; i < haystack.length; i++)
        {
            if (haystack[i] == needle)
                return i; 
        }  
        return -1;
    }

    public static int binarySearch(int needle, int[] haystack)
    {
        int left = 0;
        int right = haystack.length - 1;
        int mid = 0; 
        while (left <= right)
        {
            mid = (left + right) / 2;
            if (needle == haystack[mid])
                return mid;
            else if (needle < haystack[mid])
                right = mid - 1;
            else
            left = mid + 1;
        }
        return -(mid + 1);
    }

}