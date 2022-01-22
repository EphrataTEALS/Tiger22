package sampleCode.Arrays;

import java.util.Arrays;

public class DataStructure {
    public static void main(String[] args) {

        // Initialize an array

        int[] numbers = new int[5];

        System.out.println("numbers arrary is: " + Arrays.toString(numbers));

        int[] numbers2 = {1,2,3,4,5};

        System.out.println("numbers2 array is: " + Arrays.toString(numbers2));

        int[] daysOfWeek = new int[7];

        System.out.println("daysOfWeek array: " + Arrays.toString(daysOfWeek));



        // Populate an array


        daysOfWeek[0] = 1;
        daysOfWeek[1] = 2;
        daysOfWeek[2] = 3;
        daysOfWeek[3] = 4;
        daysOfWeek[4] = 5;
        daysOfWeek[5] = 6;
        daysOfWeek[6] = 7;

        System.out.println("daysOfWeek array populated: " + Arrays.toString(daysOfWeek));


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i+1)*2;
        }

        System.out.println("numbers arrary is now: " + Arrays.toString(numbers));


        // Access an array

        
        int count = 0;

        //Access with for each loop
        for(int num: numbers){    
          count = count + 1;
        }

        System.out.println("Count with for each: " + count); 

        //Access using a for loop

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum with for: " + sum);

         // babyGrowls array here and call countBabyGrowls Method
        int[] babyGrowls = new int[43];
        int growlCount = countBabyGrowls(babyGrowls);
        System.out.println("Baby" + " growled " + growlCount + " times!");

    }


    public static int countBabyGrowls(int[] arrayCount){

        // for loop to intialize array
        for (int i = 0; i < arrayCount.length; i++) {
         arrayCount[i] = 1;
       }
 
       int count = 0;
 
       //for each loop
       for(int num: arrayCount){    
           count = count + arrayCount[num];
       }
               return count;
 
     }

}