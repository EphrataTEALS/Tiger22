package sampleCode.Jeopardy;

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
System.out.println(mystery(0, 10));
    
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