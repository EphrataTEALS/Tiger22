import java.util.*;

public class MergeSort {
    public static void main(String[] args) {

        int [] list = {14, 32, 67, 76, 23, 41, 58, 85};

        System.out.println("Before Sort" + Arrays.toString(list));

        mergeSort(list);

        System.out.println("After Sort" + Arrays.toString(list));
    }

    public static void mergeSort(int [] a) {
        if (a.length > 1) {
            int [] left = Arrays.copyOfRange(a, 0, a.length / 2);
            int [] right = Arrays.copyOfRange(a, a.length / 2, a.length);

            mergeSort(left);
            mergeSort(right);

            merge(a, left, right);

        }
    }

    public static void merge(int [] result, int [] left, int [] right) {
        int i1 = 0;
        int i2 = 0;
        
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            }
            else {
                result[i] = right[i2];
                i2++;
            }
        }
    }
}
