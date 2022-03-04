import java.util.Random;

class Main {
   public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[200000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt();
        }
        
        //Sort.insertionSort(numbers);
        
        //System.out.println(checkSorted(numbers));

        // Declare search object
        Search search = new Search();

        // Get current time
        long start = System.nanoTime();
    
        // Call the linear search method
        Sort.bubbleSort(numbers);

        // get current time
        long end = System.nanoTime();

        // calculate time difference
        double time = end - start;

        // convert nanoseconds ---> seoncsd
        double secs = time * 0.000000001;

        // Output the total omputational time in seconds
        System.out.println(secs);
    }
    
    private static boolean checkSorted(int[] nums) 
    {
        if (nums.length < 2)
           return true;
        
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i - 1] > nums[i])
                return false;
        }
        
        return true;
    }
}


