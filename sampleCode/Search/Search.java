package sampleCode.Search;

public class Search {

    public static void main(String[] args) {
    
    //Array and Guess

    int[] numbers = {0, 1, 15, 26, 28, 30, 43, 54, 68, 72, 100, 207, 503, 1003, 2509};
    int guess = 72;

    //Sequential Search 

    System.out.println("Sequential Search position: " + seqSearch(numbers, guess));

    //Binary Search

    System.out.println("Binary Search position: " + binarySearch(numbers, guess));

    }

    public static int seqSearch(int[] arr, int n) {
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
                //System.out.println("seqTRY " + i);
        }
        return -1;
    }

    public static int binarySearch(int[] a, int target) {
    int min = 0;
    int max = a.length - 1;

    while (min <= max) {
        //System.out.println("binaryTRY");
        int mid = (min + max) / 2;
        if (a[mid] < target) {
            min = mid + 1;
        } else if (a[mid] > target) {
            max = mid - 1;
        } else {
            return mid;   // target found
 	    }
    }
    return -(min + 1);    // target not found
    }

    

}
