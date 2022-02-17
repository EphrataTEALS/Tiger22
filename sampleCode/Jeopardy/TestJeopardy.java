package sampleCode.Jeopardy;

import java.util.*;

public class TestJeopardy {

public static void main(String[] args) {
    System.out.println("HI");

    for (int i = 1; i <= 6; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    for (int i = 0; i < 4; i++) {
        for (int j = 4; j > i; j--) {
            System.out.print(4-i);
        }
    }

    int sum = 0;
        for (int i = 0; i < 5; i++) {	
            	sum = sum + i; 
            }
                System.out.println();
                System.out.println("Sum: " + sum);


                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 3; j++) {
                        System.out.print((i * j) + " ");
                    }
                    System.out.println();
                }  
                
                for(int row = 1; row < 3; row++) {
                    for(int column = 0; column < 3; column++) {
                        System.out.print(column + row + " ");
                    }
                        System.out.println();
                }


                int[] list = { 1, 2, 3 };
                for (int x : list) {
                    x++;
                    System.out.println("Count: " + x);
                }

    int count = 0;
    int[] array = {1,2,3,4,5};
      //for each loop
    for(int num: array){    
         count++;
    }
         System.out.print("Count:" + count);
         System.out.println();

    for (int i = 1; i <= 10; i++) {
        System.out.print(i*i + " ");
    }

System.out.println();
int[] num = {3, 8, 92, -4, 9};
getMin(num);

int[] a1 = {1, 3, 5, 7, 9};
int[] a2 = {1, 4, 9, 16, 25};
mystery(a1, a2);
System.out.println();
System.out.println("a1 array is now: " + Arrays.toString(a1));



System.out.println();
System.out.println(mystery(0, 10));

int[] numbers = {3, 7, 1, 0, 25, 4, 18, -1, 5};
mystery3(numbers, 3, 1);
System.out.println("numbers is now: " + Arrays.toString(numbers));


int x = 15;
sentence(x, 42);

int[] nums = {14, 7};
arrayMystery5(nums);
System.out.println("nums is now: " + Arrays.toString(nums));
    
}

public static void arrayMystery5(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] > nums[i + 1]) {
            nums[i + 1]++;
        }
    }
}

public static void sentence(int num1, int num2) {
        System.out.println(num1 + " " + num2);

}

public static void mystery3(int[] data, int x, int y) {
    data[data[x]] = data[y];
    data[y] = x;
}


public static void getMin(int[] array) {
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
        int next = array[i];
            if (next < min) {
                min = next;
            } 
        }
        System.out.println("min = " + min);
}


public static void mystery(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
        a[i] += b[b.length - 1 - i];
    }
}

public static int mystery(int x, int y) {
    while (x != 0 && y != 0) {
        if (x < y) {
            y = y - x;
        } else {
            x = x - y;
        }
    }
    return x + y;
}


}