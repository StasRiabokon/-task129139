package student;

import java.util.*;

public class MyArray {

    public static int max_value(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int average_value(int[] array) {
        int sumOfArrays = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfArrays += array[i];
        }
        return sumOfArrays / array.length;
    }

    public static void main(String[] args) {

        int[] values = {64, 70, 86, 100, 69, 45, 30, 55, 48, 27};
        System.out.println("the max value is " + max_value(values));
        System.out.println("the average value is " + average_value(values));
        Arrays.sort(values);
        for (int el : values) {
            System.out.print(el + " ");
        }

    }//end of main method    

}//end of class
